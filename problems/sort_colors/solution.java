class Solution {
    public void sortColors(int[] nums) {
        // HashMap<Integer, Integer> count = new HashMap<>();
        // count.put(0, 0);
        // count.put(1, 0);
        // count.put(2, 0);

        // for (int num : nums) {
        //     count.put(num, count.get(num) + 1);
        // }

        // int idx = 0;
        // for (int i = 0; i < 3; i++) {
        //     int freq = count.get(i);
        //     for (int j = 0; j < freq; j++) {
        //         nums[idx] = i;
        //         idx++;
        //     }
        // }

        //Using Dutch National Flag Algo
        int n = nums.length;
        int low = 0, mid = 0, high = n-1;   

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }     
    }
}