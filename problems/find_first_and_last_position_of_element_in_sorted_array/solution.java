class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];

        ans[0] = first(nums, target);
        ans[1] = last(nums, target);

        return ans;
    }
    public static int first(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int first = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                first = mid;
                end = mid-1;
            } else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return first;
    }
    public static int last(int nums[], int target){
        int start = 0;
        int end = nums.length-1;
        int last = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                last = mid;
                start = mid +1;
            } else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return last;
    }
}