class Solution {
    public boolean checkDivisibility(int n) {
        long t=(long)n,rem=0,s=0,p=1;
        while(t!=0){
            rem=t%10;
            s+=rem;
            p*=rem;
            t/=10;
        }
        if((s+p)==(long)n){
            return true;
        }
        return false;
    }
}