class Solution {
    public int climbStairs(int n) {
       if(n==1){
        return 1;
       }
       int p=1,c=1;
       for(int i=2;i<=n;i++){
        int t=c;
        c=p+c;
        p=t;
       }
       return c;
       }    
}