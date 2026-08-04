class Solution {
    int mod = (int)1e9 + 7;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;      
        long res = (helper(5, evenCount) * helper(4, oddCount)) % mod;
        return (int) res;
    }
     public long helper(int x,long n){
        if(n==0)return 1;
        x%=mod;
        long half=helper(x,n/2);
        if(n%2==0)return (half*half)%mod;
        return (half*half*x)%mod;
    }
}
