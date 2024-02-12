class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);                      //O(nlogn)
        return nums[nums.length / 2]; 
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             int count = 1;
//             for(int j=0; j<nums.length; j++){
//                 if(nums[i] == nums[j]) count++;
//             }
//             if(count > n/2) return nums[i];
//         }
//         return -1;            //O(n^2)
//     }
// }