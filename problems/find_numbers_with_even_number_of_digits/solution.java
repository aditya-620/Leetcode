class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int number){
        int dig = 0;
        while(number > 0){
            dig++;
            number = number/10;
        }
        if(dig%2 == 0){
            return true;
        }
        return false;
    }
}