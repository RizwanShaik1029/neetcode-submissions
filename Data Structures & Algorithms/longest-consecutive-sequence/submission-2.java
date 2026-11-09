class Solution {
    public int longestConsecutive(int[] nums) {
       
        int max = 0, count = 1;
        if (nums.length <= 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) {
                count++;
            } else {

                if (max < count) {
                    max = count;
                }
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
                else{
                    count=1;
                }
            }
            if (max < count) {
                max = count;
            }

            /*
            int n = nums[i]-1;
            if(map.containsKey(n))
            {
                int val = map.get(n);
                map.put(nums[i],val+1);
            }
            else
            {
                map.put(nums[i],1);
            }
            */
        }
        // for(int v : map.values())
        // {
        //     if(v>max)
        //     {
        //         max= v;
        //     }
        // }
        return max;

    }
}
