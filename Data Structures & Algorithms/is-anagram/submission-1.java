class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] c = new int[26];
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            c[t.charAt(i)-'a']--;
            if(c[t.charAt(i)-'a']<0)
            {
                return false;
            }
        }
        return true;

        /*
        if(s.length() != t.length())
        {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
        */
    }
}
