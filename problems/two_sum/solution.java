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
    }
}