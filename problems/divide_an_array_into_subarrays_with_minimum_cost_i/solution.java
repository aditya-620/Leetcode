class Solution {
    // public int minimumCost(int[] nums) {
    //     int a = 51, b = 51;

    //     for(int i=1; i<nums.length; i++){
    //         if(nums[i] < a){
    //             b = a;
    //             a = nums[i];
    //         } else if (nums[i] < b){
    //             b = nums[i];
    //         }

    //         if(a == 1 && b == 1) break;
    //     }
    //     return nums[0] + a + b;
    // }


    public int minimumCost(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                int cost = nums[0] + nums[i] + nums[j];
                ans = Math.min(ans, cost);
            }
        }
        return ans;
    }
}