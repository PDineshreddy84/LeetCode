class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n+1][2];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        return solve(0,1,prices,n,fee,dp);
    }
    int solve(int ind,int buy,int prices[],int n,int fee,int dp[][]){
        if(ind==n)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        if(buy==1){
            return dp[ind][buy]=Math.max(-prices[ind]-fee+solve(ind+1,0,prices,n,fee,dp),solve(ind+1,1,prices,n,fee,dp));
        }
        else{
            return dp[ind][buy]=Math.max(prices[ind]+solve(ind+1,1,prices,n,fee,dp),solve(ind+1,0,prices,n,fee,dp));
        }
    }
}