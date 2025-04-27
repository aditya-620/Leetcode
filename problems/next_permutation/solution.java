class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length;

        for(int i = n-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i= n-1; i>idx; i--){
            if(nums[idx] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        reverse(nums, idx+1, n-1);
    }

    public static void reverse(int arr[], int idx, int n){
        while(idx < n){
            int temp = arr[idx];
            arr[idx] = arr[n];
            arr[n] = temp;
            idx++;
            n--;
        }
    } 
}