class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] lst = new ArrayList[nums.length+1];
        for(int key : map.keySet())
        {
            int freq = map.get(key);
            if(lst[freq]==null)
            {
                lst[freq]= new ArrayList<>();
            }
            lst[freq].add(key);
        }
        int[] result = new int[k];
        int index=0;
        for(int i=lst.length-1;i>=0 && index<k;i--)
        {
            if(lst[i]!=null)
            {
                for(int n : lst[i])
                {
                    result[index]=n;
                    index++;
                    if(index == k)
                {
                    break;
                }
                }
                
            }
        }
        return result;

    }
}
