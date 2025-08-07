public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;

        int[] count1 = new int[26]; // for s1
        int[] count2 = new int[26]; // for window in s2

        // count characters in s1
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }

        // sliding window over s2
        for (int i = 0; i < len2; i++) {
            count2[s2.charAt(i) - 'a']++;

            // shrink the window
            if (i >= len1) {
                count2[s2.charAt(i - len1) - 'a']--;
            }

            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
