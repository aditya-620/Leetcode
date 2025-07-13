class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // positions: 0, 2, 4, ...
        long oddCount = n / 2;        // positions: 1, 3, 5, ...

        long evenWays = power(5, evenCount);
        long oddWays = power(4, oddCount);

        return (int)((evenWays * oddWays) % MOD);
    }

    // Recursive power with modulo
    private long power(long base, long exp) {
        if (exp == 0) return 1;

        long half = power(base, exp / 2);
        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}
