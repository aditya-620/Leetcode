class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, target, new ArrayList<>(), candidates, result);
        return result;
    }

    public static void helper(int idx, int k, List<Integer> list, int[] arr, List<List<Integer>> result) {
        // base case
        if (idx == arr.length) {
            if (k == 0) {
                result.add(new ArrayList<>(list)); // create a copy to avoid reference issues
            }
            return;
        }

        // pick current element if it's not exceeding
        if (arr[idx] <= k) {
            list.add(arr[idx]);
            helper(idx, k - arr[idx], list, arr, result);
            list.remove(list.size() - 1); // backtrack
        }

        // skip current element
        helper(idx + 1, k, list, arr, result);
    }
}
