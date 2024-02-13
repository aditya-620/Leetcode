class Solution {
    public static boolean isPalindrome(String str){
        for(int i =0; i<str.length()/2; i++){
            int n = str.length();      
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            boolean result = isPalindrome(words[i]);
            if(result == true){
                return words[i];
            }
        }
        return "";
    }
}