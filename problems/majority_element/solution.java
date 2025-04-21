class Solution {
    public int majorityElement(int[] nums) {
        //using Moore's Voting algo - O(n)
        int count = 0;
        int ele = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            } else if(nums[i] == ele){
                count++;
            } else {
                count--;
            }
        }
        return ele;
    }
}


// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);                      //O(nlogn)
//         return nums[nums.length / 2]; 
//     }
// }
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