class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int dp[][]=new int[n+1][2];
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                    dp[ind][buy]=Math.max(-prices[ind]-fee+dp[ind+1][0],dp[ind+1][1]);
                }
                else{
                    dp[ind][buy]=Math.max(prices[ind]+dp[ind+1][1],dp[ind+1][0]);
                }
            }
        }
        return dp[0][1];
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