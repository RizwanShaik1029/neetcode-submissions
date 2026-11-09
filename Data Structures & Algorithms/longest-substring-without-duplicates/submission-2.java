class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0,max=0;
        while (r < s.length()) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
            } else {
                max = Math.max(max, set.size());
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                r++;
            }
        }
        max = Math.max(max, set.size());
        
        /*
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
        
        */
        return max;
    }
}
