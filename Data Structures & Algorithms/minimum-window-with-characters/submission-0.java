class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(),m=t.length();
        if(n<m)
        {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        int count =m;
        int j=0;
        int minLen=Integer.MAX_VALUE;
        int start =0;
        for(int i=0;i<m;i++)
        {
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                if(map.get(c)>0)
                {
                    count--;
                }
                map.put(c,map.get(c)-1);
            }
            while(count == 0)
            {
                if(i-j+1<minLen)
                {
                    minLen = i-j+1;
                    start = j;
                }

                if(map.containsKey(s.charAt(j)))
                {
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                    if(map.get(s.charAt(j)) > 0)
                    {
                        count++;
                    }

                }
                j++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}
