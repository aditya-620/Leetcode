class Solution {
    public String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");

        String ans = "";
        int n = str.length;
        for(int i=n-1; i>0; i--){
            ans += str[i] + " "; 
        } 
        return ans +str[0];
    }
}