class Solution {
    //optimal sol
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, ans);
        return ans;
    }
    public static void helper(int idx, int arr[], List<List<Integer>> ans){
        //base case
        if(idx == arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                list.add(arr[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx; i<arr.length; i++){
            swap(idx, i, arr);
            helper(idx+1, arr, ans);
            swap(idx, i, arr);  //swap again, as we backtrack
        }
    }
    public static void swap(int i, int j, int arr[]){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    // brute force
    // public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     ArrayList<Integer> ds = new ArrayList<>();
    //     boolean freq[] = new boolean[nums.length];
    //     helper(nums, ds, ans, freq);
    //     return ans;
    // }
    // public static void helper(int arr[], ArrayList<Integer> ds, List<List<Integer>> ans, boolean freq[]){
    //     //base case
    //     if(ds.size() == arr.length){
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //     }

    //     for(int i=0; i<arr.length; i++){
    //         if(!freq[i]){
    //             freq[i] = true;
    //             ds.add(arr[i]);
    //             helper(arr, ds, ans, freq);
    //             ds.remove(ds.size()-1);
    //             freq[i] = false;
    //         }
    //     }
    // }
}