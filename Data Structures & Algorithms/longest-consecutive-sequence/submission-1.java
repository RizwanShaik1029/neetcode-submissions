class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i]-1;
            if(map.containsKey(n))
            {
                int val = map.get(n);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int v : map.values())
        {
            if(v>max)
            {
                max= v;
            }
        }
        return max;
    }
}
