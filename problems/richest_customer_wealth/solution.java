class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxsum = 0;
        for(int i=0; i<accounts.length; i++){
            int currsum = 0;
            for(int j=0; j<accounts[i].length; j++){
                currsum = currsum + accounts[i][j];
            }
            if(maxsum < currsum){
                maxsum = currsum;
            }
        }
        return maxsum;
    }
}