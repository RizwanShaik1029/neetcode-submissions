class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int k = 1;
        int l = 0;
        
        for (int i = 0; i < piles.length; i++) {
            l = Math.max(l, piles[i]);
        }

        int ans = l;

        while (k <= l) {
            int mid = k + (l - k) / 2;
            long n = 0;

            for (int i = 0; i < piles.length; i++) {
                n += (piles[i] + mid - 1) / mid;
            }

            if (n <= h) {
                ans = mid;
                l = mid - 1;
            } 
            else {
                k = mid + 1;
            }
        }

        return ans;
    }
}