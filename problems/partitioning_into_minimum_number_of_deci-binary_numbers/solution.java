class Solution {
    public int minPartitions(String n) {
        int max = -1;

        for (char c : n.toCharArray()) {
            max = Math.max(max, c - '0');   // convert char → int
            
            // Early stop if we reach 9 (maximum possible)
            if (max == 9) {
                return 9;
            }
        }
        return max;
    }
}