class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ar = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        int index = 0;
        if(k==1)
        {
            return nums;
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (max > nums[i + k - 1] && i<=index) {
                ar[i] = max;
            } else {
                max= nums[i];
                for (int j = i; j < i + k; j++) {
                    if(max<nums[j])
                    {
                        max = nums[j];
                        index = j;
                    }
                }
                ar[i] = max;
            }
        }
        return ar;
    }
}
