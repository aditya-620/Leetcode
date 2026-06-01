class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int c = 0;
        int i = cost.length-1;
        if(cost.length == 2){
            c = cost[0] + cost[1];
            return c;
        } else if(cost.length == 1){
            return cost[0];
        }else {
            while(i >= 2){
                c += cost[i] + cost[i-1];
                i=i-3;
            }
            while(i >= 0){
                c += cost[i];
                i--;
            }
        }
        
        return c;
    }
}