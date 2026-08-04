class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int prev[]=new int[amount+1];
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0)prev[t]=t/coins[0];
            else prev[t]=(int)1e9;
        }
        for(int ind=1;ind<n;ind++){
            int curr[]=new int[amount+1];
            for(int t=0;t<=amount;t++){
                int notTake=prev[t];
                int take=Integer.MAX_VALUE;
                if(coins[ind]<=t){
                    take=1+curr[t-coins[ind]];
                }
                curr[t]=Math.min(take,notTake);
            }
            prev=curr;
        }
        int ans=prev[amount];
        return ans>=(int)1e9?-1:ans;
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