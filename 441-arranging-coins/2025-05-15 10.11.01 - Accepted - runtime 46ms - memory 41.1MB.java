class Solution {
    public int arrangeCoins(int n) {
        long ans=(long)n/2+1;
       for(long i=1;i<=n/2+1;i++){
            if((i*(i+1))/2<=n){
                ans=i;
            }
            else{
                break;
            }
       }
       return (int)ans;
    }
}