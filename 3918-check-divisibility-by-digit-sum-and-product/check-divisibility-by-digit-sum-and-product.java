class Solution {
    public boolean checkDivisibility(int n) {
        long prod=1,sum=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        return (num%(sum+prod)==0)?true:false;
    }
}