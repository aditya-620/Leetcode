class Solution {
    public String restoreString(String s, int[] indices) {

        char[] res= new char[s.length()];
        for(int i=0;i<s.length();i++){
            res[indices[i]]=s.charAt(i);
        }
        return new String(res);

        // String ans = "";
        // for(int i=0; i<indices.length; i++){
        //     for(int j=0; j<indices.length; j++){
        //         if(indices[j] == i){
        //             ans += s.charAt(j);
        //         }
        //     }
        // }
        // return ans;
    }
}