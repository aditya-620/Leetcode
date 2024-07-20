class Solution {
    public String losingPlayer(int x, int y) {
        int alice = 0;
        int bob = 0;
        while(x>=1 && y >=4){
            if(x>=1 && y >=4){
                x--;
                y = y -4;
                alice++;
            }
            if(x>=1 && y >=4){
                x--;
                y = y -4;
                bob++;
            }
        }
        if(alice > bob){
            return "Alice";
        } else{
            return "Bob";
        }
    }
}