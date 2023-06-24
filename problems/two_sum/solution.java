public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2] ;
        int number1 = 0;
        for (int i = 0; i < numbers.length; i++) {  
            for(int j = i+1; j < numbers.length; j++){   
                if(numbers[i]+numbers[j]== target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}