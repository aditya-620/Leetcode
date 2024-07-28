class Solution {
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i*i <=num ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public int nonSpecialCount(int l, int r) {
        int count = 0;
        for(int i=2; i*i<=r; i++){
            if(isPrime(i)){
                int square = i*i;
                if(square >= l && square <= r){
                    count++;
                }
            }
        }
           
        return r-l-count+1;
    }
}