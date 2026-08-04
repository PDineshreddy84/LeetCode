class Solution {
    static int m=1009;
    static int primes[]=new int[m];
    static{
        primes[0]=1;
        primes[1]=1;
        for(int i=2;i*i<=m;i++){
            if(primes[i]==0){
                for(int j=i*i;j<m;j+=i){
                    primes[j]=1;
                }
            }
        }
    }
    public int sumOfPrimesInRange(int n) {
        int rev=reverse(n);
        int st=Math.min(n,rev);
        int en=Math.max(n,rev);
        long sum=0;
        for(int i=st;i<=en;i++){
            if(primes[i]==0){
                sum+=i;
            }
        }
        return (int)sum;
    }
    int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}