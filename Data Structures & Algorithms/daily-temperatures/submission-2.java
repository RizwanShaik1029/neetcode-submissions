class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temp.length;i++)
        {
            while(!stack.isEmpty() && temp[i] > temp[stack.peek()])
            {
                int index = stack.pop();
                ans[index] = i-index;
            }
            stack.push(i);
        }
        return ans;

        /*
        int count =1,l=0;
        for(int i=0;i<temp.length-1;i++)
        {
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[i]>=temp[j])
                {
                    count++;
                }
                else{
                    temp[i]=count;
                    count=1;l++;
                    break;
                }
                if(j==temp.length-1 && temp[i]>=temp[j])
                {
                    temp[i] = 0;
                    count =1;
                    l++;
                }
            }
        }
        while(l<temp.length)
        {
            temp[l++]=0;
        }
        return temp;
        */
    }
}
