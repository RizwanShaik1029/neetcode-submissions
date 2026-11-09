class Solution {

   public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs.size();i++) {
            int count = strs.get(i).length();
            ans.append(count + "#");
            ans.append(strs.get(i));

        }
        return ans.toString();
    }
    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        int i=0,j=0;
        while(i<str.length())
        { //4#rock3#one
            j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            j++;
            lst.add(str.substring(j,j+len));
            i=j+len;
        }
        return lst;
    }
}
