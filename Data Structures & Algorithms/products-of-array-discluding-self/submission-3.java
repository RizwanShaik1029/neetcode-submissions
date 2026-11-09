class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ar = new int[nums.length];
        ar[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            ar[i] = nums[i-1]*ar[i-1];
        }
        int suffix = 1;

        for(int i=nums.length-1;i>=0;i--)
        {
            ar[i] = ar[i] * suffix;
            suffix = suffix * nums[i];
        }

        /*
        int product = 1,count=0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){
                product = product * nums[i];
            }
            else{
                flag = true;
                count++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(flag==true)
            {
                if(count >1)
                {
                    return ar;
                }
                if(nums[i]!=0)
                {
                    ar[i]=0;
                }
                else{
                    ar[i]=product;
                }
            }
            else{
                ar[i]  = product/nums[i];
            }
        }
        */
        return ar;
    }
}  
