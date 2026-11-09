class Solution {
    public int longestConsecutive(int[] nums) {
        /*
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



        }
        */
        // for(int v : map.values())
        // {
        //     if(v>max)
        //     {
        //         max= v;
        //     }
        // }
        // int[] ar = {2,20,4,10,3,4,5};
  
        if(nums.length<=1)
        {
            return nums.length;
        }
		Arrays.sort(nums);
		int count=1,max=0;
		for(int i=0;i<nums.length-1;i++)
		{
		    if(nums[i] ==nums[i+1]-1)
		    {
		        count++;
            }
            else{
                max = Math.max(max,count);
                 if(nums[i]<nums[i+1]-1)
                {
                    count=1;
                }
            }
		}
        
        max = Math.max(max,count);
        return max;
        

    }
}
