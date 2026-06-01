class Solution {
    public int removeDuplicates(int[] nums) {
        //two pointer
        int i = 0;
        int j = 1;
        int c = 1;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
                c++;
            }
        }
        return c;


        
        // int count = 0;
        
        // for (int i = 0; i < nums.length; i++) {
        //     // If the current element is equal to the next element, we skip
        //     if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
        //         continue;
        //     }
        //     // We will update the array in place
        //     nums[count] = nums[i];
        //     count++;
        // }
        // return count;
    }
}