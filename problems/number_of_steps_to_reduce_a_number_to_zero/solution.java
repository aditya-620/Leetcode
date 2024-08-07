class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public int helper(int num, int counter){
        if(num == 0){
            return counter;
        }
        if(num%2==0){
            return helper(num/2, ++counter);
        } else {
            return helper(num-1, ++counter);
        }
    }
}