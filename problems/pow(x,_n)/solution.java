class Solution {
    public double myPow(double x, long n) {
        //base case
        if(n == 0){
            return 1;
        }
        //recursion
        
        if (n < 0){
            n = -n;
            x = 1/x;
        }
        //for odd number
        if(n%2 != 0){
            return x * myPow(x*x,n/2);
        }else{
            return myPow(x*x,n/2);
        }
        
    }
}