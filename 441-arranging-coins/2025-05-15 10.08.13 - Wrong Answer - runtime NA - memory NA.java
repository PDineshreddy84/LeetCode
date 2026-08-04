class Solution {
    public int arrangeCoins(int n) {
        int ans=n/2+1;
       for(int i=1;i<=n/2;i++){
            if((i*(i+1))/2<=n){
                ans=i;
            }
            else{
                break;
            }
       }
       return ans;
    }
}