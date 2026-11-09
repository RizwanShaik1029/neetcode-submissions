class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int j= i+1;
            if(prices[i]<prices[j])
            {
                min = Math.min(min,prices[i]);
                max = prices[j];
                profit = Math.max(profit,max-min);
            }
        }
        return profit;
    }
}
