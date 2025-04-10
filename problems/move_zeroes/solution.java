class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[left] = temp;
                left++;
            }
        }
        // for(int i=0; i<nums.length; i++){
        //     if(nums[left] != 0){
        //         left++;
        //     }
        //     else if(nums[left] == 0 && nums[i] != 0){
        //         nums[left] = nums[i];
        //         nums[i] = 0;
        //         left++;
        //     }
        // }
    }
}