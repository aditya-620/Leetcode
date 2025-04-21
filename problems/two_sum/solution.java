public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int arr[] = new int[2]; 
        for(int i=0; i<numbers.length; i++){
            int nums = numbers[i];
            int left = target - numbers[i];
            if(mpp.containsKey(left)){
                arr[0] = mpp.get(left);
                arr[1] = i;
            }
            mpp.put(nums, i);
        }
        return arr;


        //optimal approach 
        //but here can't be used as we have to return the original index of the array

        // Arrays.sort(numbers);
        // int n = numbers.length;
        // int left = 0;
        // int right = n-1;
        // int arr[] = new int[2];
        // while(left < right){
        //     int sum = numbers[left] + numbers[right];
        //     if(sum == target){
        //         arr[0] = left;
        //         arr[1] = right;
        //         return arr;
        //     } else if (sum < target){
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // arr[0] = -1;
        // arr[1] = -1;
        // return arr;
    }
}