class Solution {
    public boolean checkInclusion(String s1, String s2) {
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String s = s2.substring(i,i+s1.length());
            if(valid(s,s1))
            {
                return true;
            }
        }
        return false;
    }
    public boolean valid(String s, String s1)
    {
        
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            arr[s1.charAt(i)-'a']++;
        // }
        // for(int i=0;i<s.length();i++)
        // {
            arr[s.charAt(i)-'a']--;
        }
        for(int n : arr)
        {
            if(n != 0)
            {
                return false;
            }
        }
        return true;
    }
}
