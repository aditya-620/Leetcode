class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        // Step 1: Try all substrings
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];  // frequency of each character

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c - 'a']++;

                // Step 2: check if current substring s[i..j] is balanced
                if (isBalanced(freq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

     private boolean isBalanced(int[] freq) {
        int common = 0;
        for (int f : freq) {
            if (f > 0) {
                if (common == 0) common = f; // first frequency found
                else if (f != common) return false; // mismatch found
            }
        }
        return true;
    }
}