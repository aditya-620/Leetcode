class Solution {
    public boolean check(int[] nums) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1)%(nums.length)]){  //(i+1)%n is used to compare the last and the 1st ele
                k++;
            }
        }
        if(k > 1){   //if not 1, then the arr is not sorted
            return false;   
        }
        return true;
    }
}

//[2,1,3,4] is false as 4>2 ,(k=2)