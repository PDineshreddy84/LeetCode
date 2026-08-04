class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0)dp[0][t]=t/coins[0];
            else dp[0][t]=(int)1e9;
        }
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                int notTake=dp[ind-1][t];
                int take=Integer.MAX_VALUE;
                if(coins[ind]<t){
                    take=1+dp[ind][t-coins[ind]];
                }
                dp[ind][t]=Math.min(take,notTake);
            }
        }
        return dp[n-1][amount]>=(int)(1e9)?-1:dp[n-1][amount];
    }
    // int solve(int ind,int[] coins,int amount,int dp[][]){
    //     if(ind==0){
    //         if(amount%coins[0]==0){
    //             return amount/coins[0];
    //         }
    //         return (int)1e9;
    //     }
    //     if(dp[ind][amount]!=-1)return dp[ind][amount];
    //     int notTake=solve(ind-1,coins,amount,dp);
    //     int take=Integer.MAX_VALUE;
    //     if(coins[ind]<=amount){
    //         take=1+solve(ind,coins,amount-coins[ind],dp);
    //     }
    //     return dp[ind][amount]=Math.min(take,notTake);
    // }
}