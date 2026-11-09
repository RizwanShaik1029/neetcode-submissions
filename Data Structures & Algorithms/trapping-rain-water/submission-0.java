class Solution {
    public int trap(int[] height) {
        int l = 0, r= height.length-1,ml=0,mr=0,sum=0;
        while(l<r)
        {
            ml = Math.max(ml,height[l]);
            mr = Math.max(mr,height[r]);
            if(height[l]<height[r])
            {
                sum = sum+(ml-height[l]);
                l++;
            } 
            else{
                sum = sum+(mr-height[r]);
                r--;
            }
            
        }
        return sum;
    }
}
