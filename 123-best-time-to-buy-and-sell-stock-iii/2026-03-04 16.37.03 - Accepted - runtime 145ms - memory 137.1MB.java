class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n+1][2][3];
        for(int i=0;i<=n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return solve(0,1,2,prices,n,dp);
    }
    int solve(int ind,int buy,int cap,int prices[],int n,int dp[][][]){
        if(cap==0)return 0;
        if(ind==n)return 0;
        if(dp[ind][buy][cap]!=-1)return dp[ind][buy][cap];
        if(buy==1){
            return dp[ind][buy][cap]=Math.max(-prices[ind]+solve(ind+1,0,cap,prices,n,dp),solve(ind+1,1,cap,prices,n,dp));
        }
        else{
            return dp[ind][buy][cap]=Math.max(prices[ind]+solve(ind+1,1,cap-1,prices,n,dp),solve(ind+1,0,cap,prices,n,dp));
        }
    }
}