class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {   
                if ("aeiou".indexOf(ch) != -1) {
                    v++; 
                } else {
                    c++; 
                }
            }
        }
        
        if (c > 0) {
            return v / c; 
        }
        return 0;
    }
}