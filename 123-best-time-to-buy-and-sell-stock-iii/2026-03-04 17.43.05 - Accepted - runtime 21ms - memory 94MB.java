class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n+1][5];
        for(int ind=n-1;ind>=0;ind--){
            for(int trans=0;trans<4;trans++){
                if(trans%2==0){
                    dp[ind][trans]=Math.max(-prices[ind]+dp[ind+1][trans+1],dp[ind+1][trans]);
                }
                else{
                    dp[ind][trans]=Math.max(prices[ind]+dp[ind+1][trans+1],dp[ind+1][trans]);
                }
            }
        }
        return dp[0][0];
    }
    int solve(int ind,int trans,int prices[],int n,int dp[][]){
        if(ind==n||trans==4)return 0;
        if(dp[ind][trans]!=-1)return dp[ind][trans];
        if(trans%2==0){
            return dp[ind][trans]=Math.max(-prices[ind]+solve(ind+1,trans+1,prices,n,dp),solve(ind+1,trans,prices,n,dp));
        }
        else{
            return dp[ind][trans]=Math.max(prices[ind]+solve(ind+1,trans+1,prices,n,dp),solve(ind+1,trans,prices,n,dp));
        }
    }
}