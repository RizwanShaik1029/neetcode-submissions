class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> lst = new ArrayList<>();
        int max= 0;
        for(int i=0;i<s.length();i++)
        {
            if(!lst.contains(s.charAt(i))){
                lst.add(s.charAt(i));
                max  = Math.max(max,lst.size());
            }
            else{
                int size = lst.indexOf(s.charAt(i));
                lst.subList(0,size+1).clear();
                lst.add(s.charAt(i));
            }
        }
        max = Math.max(max,lst.size());
        return max;
    }
}
