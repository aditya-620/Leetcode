class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, target, new ArrayList<>(), ans, candidates);
        return ans;
    }
    public static void helper(int idx, int tar, ArrayList<Integer> list, List<List<Integer>> ans, int arr[]){
        //base case
        if(tar == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > tar) break;

            list.add(arr[i]);
            helper(i+1, tar-arr[i], list, ans, arr);
            list.remove(list.size()-1);
        }
    }
}