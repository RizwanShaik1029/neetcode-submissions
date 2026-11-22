class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i])
            {
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty())
                {
                    width = i;
                }
                else{
                    width = i-stack.peek()-1;
                }
                int area = height * width;
                maxArea = Math.max(area,maxArea);
            }
            stack.push(i);
        }
        while(!stack.isEmpty())
        {
            int height = heights[stack.pop()];
            int width;
            if(stack.isEmpty())
            {
                width = n;
            }
            else{
                width = n-stack.peek()-1;
            }
            int area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
