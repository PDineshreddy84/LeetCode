class Solution {
    public int smallestNumber(int n, int t) {
        int res=0;
        int r=n;
        int rem=0;
        int p=1;
        while(r!=0){
         rem=r%10;
         r=r/10;
         p*=rem;
        }
        if(p%t==0)
        return n;
        else
        return n+(t-p%t);
    }
}