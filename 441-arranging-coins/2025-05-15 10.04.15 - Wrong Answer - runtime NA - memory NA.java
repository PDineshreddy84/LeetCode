class Solution {
    public int arrangeCoins(int n) {
        int ans=n;
       for(int i=1;i<=n/2;i++){
            if((i*(i+1))/2<n){
                ans=i;
            }
       }
       return ans;
    }
}