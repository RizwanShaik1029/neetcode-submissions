class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int k = 1;
        int max = 0;
        
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int ans = max;

        while (k <= max) {
            int mid = k + (max - k) / 2;
            long n = 0;

            for (int i = 0; i < piles.length; i++) {
                n += (piles[i] + mid - 1) / mid;
            }

            if (n <= h) {
                ans = mid;
                max = mid - 1;
            } 
            else {
                k = mid + 1;
            }
        }

        return ans;
    }
}