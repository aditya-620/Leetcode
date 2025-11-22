class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[101];

        for(int i=0; i<nums.length; i++){
            ans[nums[i]]++;
        }

        for(int i=1; i<101; i++){
            ans[i] +=ans[i-1];
        }

        for(int i=0; i<nums.length; i++){
            int pos = nums[i];
            if(pos == 0) nums[i] = 0;
            else nums[i] = ans[pos-1];
        }

        return nums;
        // int ans[] = new int[nums.length];
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if((nums[i] > nums[j]) && (nums[j] != nums[i])){
        //             count++;
        //         }
        //     }
        //     ans[i] = count;
        //     count = 0;
        // }
        // return ans;
    }
}