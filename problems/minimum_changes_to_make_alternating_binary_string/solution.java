class Solution {
    public int minOperations(String s) {
        int startWithZero = 0;
        int startWithOne = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // pattern: 010101...
            if (i % 2 == 0) {
                if (c != '0') startWithZero++;
                if (c != '1') startWithOne++;
            } 
            // pattern: 101010...
            else {
                if (c != '1') startWithZero++;
                if (c != '0') startWithOne++;
            }
        }

        return Math.min(startWithZero, startWithOne);
    }
}