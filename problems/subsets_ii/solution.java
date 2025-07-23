class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); 
        helper(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void helper(int idx, int[] nums, List<Integer> list, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(list)); // Add current subset

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue; // Skip duplicates
            list.add(nums[i]);
            helper(i + 1, nums, list, ans); // Move to next element
            list.remove(list.size() - 1); // Backtrack
        }
    }
}
