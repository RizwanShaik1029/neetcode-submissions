class Solution {
    public int[] dailyTemperatures(int[] temp) {
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
    }
}
