class Solution {
    public boolean isPalindrome(String s) {
       String t= s.toLowerCase();
        StringBuilder c = new StringBuilder();
//        t.append();
        for(int i=0;i<t.length();i++)
        {
            if(((t.charAt(i)>='a' && t.charAt(i)<='z') ||(t.charAt(i)>='0' && t.charAt(i)<='9')))
            {
                c.append(t.charAt(i));
            }
        }
        String s1 = c.toString();
        int l = 0, r= s1.length()-1;
        while(l<=r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
            {
                return false;
            }
            l++;r--;
        }
        return true;
    }
}
