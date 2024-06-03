class Solution {
    public int appendCharacters(String s, String t) {
        int si = 0, ti = 0;
        int slen = s.length(), tlen = t.length();

        while(si < slen && ti < tlen){
            if(s.charAt(si) == t.charAt(ti)){
                ti++;
            }
            si++;
        } 
        return tlen - ti;
    }
}