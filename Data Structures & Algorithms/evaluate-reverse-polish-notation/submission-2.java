class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        int val1 = Integer.parseInt(tokens[0]);

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("*") || tokens[i].equals("/")
                || tokens[i].equals("-")) {
                st1.push(tokens[i]);
            }
            if ((!tokens[i].equals("+") && !tokens[i].equals("*") && !tokens[i].equals("/")
                    && !tokens[i].equals("-"))) {
                st2.push(tokens[i]);
            }

            if (!st1.isEmpty()) {
                String opera = st1.peek();
                int val2 = Integer.parseInt(st2.pop());
                 val1 = Integer.parseInt(st2.pop());
                if (opera.equals("+")) {
                    val1 = val1 + val2;
                } else if (opera.equals("*")) {
                    val1 = val1 * val2;
                } else if (opera.equals("/")) {
                    val1 = val1 / val2;
                } else if (opera.equals("-")) {
                    val1 = val1 - val2;
                }
                st1.pop();
                st2.push(String.valueOf(val1));
            }
        }
        return val1;
    }
}
