class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            dp[0][i]=amount%coins[0]==0?1:0;
        }
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                int notTake=dp[ind-1][t];
                int take=0;
                if(coins[ind]<=t){
                    take=dp[ind][t-coins[ind]];
                }
                dp[ind][t]=take+notTake;
            }
        }
        return dp[n-1][amount];
    }
    // int solve(int ind,int coins[],int target,int dp[][]){
    //     if(ind==0){
    //         if(target%coins[0]==0)return 1;
    //         else return 0;
    //     }
    //     if(dp[ind][target]!=-1)return dp[ind][target];
    //     int notTake=solve(ind-1,coins,target,dp);
    //     int take=0;
    //     if(coins[ind]<=target){
    //         take=solve(ind,coins,target-coins[ind],dp);
    //     }
    //     return dp[ind][target]=take+notTake;
    // }
}