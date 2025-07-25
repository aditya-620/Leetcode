class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        boolean pos = false;

        for (int num : nums) {
            set.add(num);
            if (num >= 0) {
                pos = true;
            } else {
                max = Math.max(max, num);
            }
        }

        if (!pos) return max;

        int sum = 0;
        for (int num : set) {
            if (num >= 0) {
                sum += num;
            }
        }

        return sum;
    }
}
