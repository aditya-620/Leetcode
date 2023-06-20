class Solution {
    public static int maxSubArray(int nums[]) {
        int ms = Integer.MIN_VALUE;   //maxSum(ms) = -infinity
        int cs = 0;    //currentSum

        //loop
        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];
            if(cs<0){        
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        if(ms == 0){
            int hp = Integer.MIN_VALUE;
            for(int i=0; i<=nums.length-1;i++){
                hp = Math.max(hp,nums[i]);
            }
            return hp;
        }else{
            return ms;
        }}
     public static void main(String args[]){
        int nums[] = {-2,-10,-3,-5,10,2};
        System.out.println(maxSubArray(nums));
     }    
    }
    
