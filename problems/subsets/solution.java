class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void helper(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've considered all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current)); 
            return;
        }

        // Choice 1: Include the current element
        current.add(nums[index]);
        helper(index + 1, nums, current, result);

        // Backtrack: Remove the element before exploring the next choice
        current.remove(current.size() - 1);

        // Choice 2: Exclude the current element
        helper(index + 1, nums, current, result);
    }
}