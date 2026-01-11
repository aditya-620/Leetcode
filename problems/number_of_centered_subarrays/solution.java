class Solution {
    public int centeredSubarrays(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                set.add(nums[j]);  

                if (set.contains(sum)) {
                    count++;
                }
            }
        }
        return count;
    }
}