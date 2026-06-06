class Solution {
    public boolean consecutiveSetBits(int n) {
        String bin = Integer.toBinaryString(n);
        int c = 0;

        for(int i=0; i<bin.length()-1; i++){
            if(bin.charAt(i) == '1' && bin.charAt(i+1) == '1'){
                c++;
            }
        }
        return c == 1;
    }
}