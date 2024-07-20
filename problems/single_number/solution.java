class Solution {
    public int singleNumber(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count == 1){
        //         return nums[i];
        //     }
        // }

        //---------------------------------------------

        // int n = arr.length;

        // // Declare the hashmap.
        // // And hash the given array:
        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     int value = mpp.getOrDefault(arr[i], 0);
        //     mpp.put(arr[i], value + 1);
        // }

        // //Find the single element and return the answer:
        // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
        //     if (it.getValue() == 1) {
        //         return it.getKey();
        //     }
        // }
        // return -1;

        //-------------------------------------------------

        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
}