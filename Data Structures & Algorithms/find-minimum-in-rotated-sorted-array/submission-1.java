class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1,mid=0;
        int min = nums[0];
        while(l<=r)
        {
            mid = (l+r)/2;
            min = Math.min(min,nums[mid]);
            if(nums[mid] > nums[l] && nums[mid] < nums[r])
            {

                r= mid-1;
            }
            else if(nums[mid]<nums[l] && nums[mid]<nums[r])
            {
                r = mid -1;
            }
            else {
                l = mid +1;
            }
        }
        return min;
    }
}
