class Solution {
    public int[] sortedSquares(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int idx = arr.length-1;
        int[] res = new int[arr.length];

        while(l <= r){
            int ls = arr[l]*arr[l];
            int rs = arr[r]*arr[r];

            if(ls > rs){
                res[idx] = ls;
                l++;
            } else {
                res[idx] = rs;
                r--;
            }
            idx--;
        }
        return res;
    }
}