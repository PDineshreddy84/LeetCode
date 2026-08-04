class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return solve(n-1,coins,amount,dp);
    }
    int solve(int ind,int coins[],int target,int dp[][]){
        if(ind==0){
            if(target%coins[0]==0)return 1;
            else return 0;
        }
        if(dp[ind][target]!=-1)return dp[ind][target];
        int notTake=solve(ind-1,coins,target,dp);
        int take=0;
        if(coins[ind]<=target){
            take=solve(ind,coins,target-coins[ind],dp);
        }
        return dp[ind][target]=take+notTake;
    }
}