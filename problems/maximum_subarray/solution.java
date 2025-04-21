class Solution {
    public static int maxSubArray(int nums[]) {
        int ms = Integer.MIN_VALUE;   
        int cs = 0;   

        for(int i=0; i<nums.length; i++){
            cs += nums[i];
            if(cs <=0 ){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        
        if(ms == 0) {
            int hp = Integer.MIN_VALUE;
            for(int i=0; i<=nums.length-1;i++) {
                hp = Math.max(hp, nums[i]);
            }
            return hp;
        } else {
            return ms;
        }
    }   
}