class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int l = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int r = 0; r < s.length(); r++) {

            // Add current character to the window
            freq[s.charAt(r) - 'A']++;

            // Update the highest frequency character in the current window
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            // If more than k replacements are needed, shrink the window
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            // Update answer
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
