class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            List<String> lst = new ArrayList<>();
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = String.valueOf(c);
            
          //  map.computeIfAbsent(s,k-> new ArrayList<>()).add(strs[i]);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());
            }
            lst = map.get(s);
            lst.add(strs[i]);
            map.getOrDefault(s,lst);

        }
        return new ArrayList<>(map.values());
    }
}
