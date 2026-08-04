class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp[][]=new int[n+1][(k*2)+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        return solve(0,0,(k*2),prices,n,dp);
    }
    int solve(int ind ,int trans,int k,int prices[],int n,int dp[][]){
        if(ind==n||trans==k)return 0;
        if(dp[ind][trans]!=-1)return dp[ind][trans];
        if(trans%2==0){
            return dp[ind][trans]=Math.max(-prices[ind]+solve(ind+1,trans+1,k,prices,n,dp),solve(ind+1,trans,k,prices,n,dp));
        }
        else{
            return dp[ind][trans]=Math.max(prices[ind]+solve(ind+1,trans+1,k,prices,n,dp),solve(ind+1,trans,k,prices,n,dp));
        }
    }
}