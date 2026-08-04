class Solution {
    static int n=(int)(1e7);
    static boolean isPrime[]=new boolean[n];
    static int primeCount[]=new int[n];
    static{
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(long i=2;i*i<n;i++){
            if(isPrime[(int)i]){
                for(long j=(long)(i*i);j<n;j+=i){
                    isPrime[(int)j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                primeCount[i]=1+primeCount[i-1];
            }
            else{
                primeCount[i]=primeCount[i-1];
            }
        }
    }
    public int countPrimes(int n) {
        return primeCount[n];
    }
}