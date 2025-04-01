class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[(i+k)%n] = nums[i];
        // }
        // for(int i=0; i<n; i++){
        //     nums[i] = arr[i];
        // }

        //optimal sol
        k = k % nums.length;
        int n = nums.length;
        // Reverse first n-k elements
        Reverse(nums, 0, n - k - 1);
        // Reverse last k elements
        Reverse(nums, n - k, n - 1);
        // Reverse whole array
        Reverse(nums, 0, n - 1);
    }
    public static void Reverse(int[] arr, int start, int end) {
        
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}