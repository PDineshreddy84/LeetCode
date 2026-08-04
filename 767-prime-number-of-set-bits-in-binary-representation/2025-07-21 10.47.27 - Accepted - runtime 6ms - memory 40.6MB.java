class Solution {
    public int countPrimeSetBits(int l, int r) {
        int c=0;
       for(int i=l;i<=r;i++){
            if(isPrime(count(i))){
                c++;
            }
        }
        return c;
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            n&=(n-1);
            c++;
        }
        return c;
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}