class Solution {
    int mod = (int)1e9 + 7;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // number of even positions
        long oddCount = n / 2;        // number of odd positions

        long res = (pow(5, evenCount) * pow(4, oddCount)) % mod;
        return (int) res;
    }

    // Fast exponentiation
    private long pow(long base, long exp) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) { // if exp is odd
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1; // divide exp by 2
        }
        return result;
    }
}
