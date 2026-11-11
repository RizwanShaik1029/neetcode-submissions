class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() <= 1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char ch = stack.get(stack.size() - 1);
                    if (ch == '(' && c == ')') {
                        stack.pop();
                    } else if (ch == '[' && c == ']') {
                        stack.pop();
                    } else if (ch == '{' && c == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
