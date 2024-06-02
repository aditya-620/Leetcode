class Solution {
    public int minimumChairs(String s) {
        int curr = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                curr++;
            }
            if(curr>max){
                max = curr;
            }
            if(s.charAt(i) == 'L'){
                curr--;
            }
        }
        return max;
    }
}