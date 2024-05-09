class Solution {
    public int reverse(int xx) {
        int x = Math.abs(xx);
        int rev = 0;
            while(x>0){
                int lastdig = x % 10;
                // Check for overflow
                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastdig > 7))
                    return 0;
                if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastdig < -8))
                    return 0;
            
                rev = (rev*10) + lastdig;
                x = x/10;
            }
            
        return (xx < 0) ? (-rev) : rev;
    }
}

// Integer.MIN_VALUE represents the minimum value that a 32-bit signed integer can hold. This value is -2^31.
// Integer.MAX_VALUE represents the maximum value that a 32-bit signed integer can hold. This value is 2^31 - 1.
// Therefore, the condition reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE ensures that reversed is within the range 
// [−2^31,2^(31−1)]
