class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;    //left pointer
        int rp = height.length-1;   //left pointer

        while(lp < rp){
            int ht = Math.min(height[lp],height[rp]);   
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(maxWater, currWater);
            //update pointer
            if(height[lp] < height[rp]){
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;

    }
}