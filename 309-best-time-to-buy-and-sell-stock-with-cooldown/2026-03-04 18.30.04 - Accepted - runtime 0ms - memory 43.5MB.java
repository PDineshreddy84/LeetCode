class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ahead1[]=new int[2];
        int ahead2[]=new int[2];
        for(int ind=n-1;ind>=0;ind--){
            int curr[]=new int[2];
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                    curr[buy]=Math.max(-prices[ind]+ahead1[0],ahead1[1]);
                }
                else{
                    curr[buy]=Math.max(prices[ind]+ahead2[1],ahead1[0]);
                }
            }
            ahead2=ahead1;
            ahead1=curr;
        }
        return ahead1[1];
    }
    int solve(int ind,int buy,int prices[],int n,int dp[][]){
        if(ind>=n)return 0;
        if(dp[ind][buy]!=-1)return dp[ind][buy];
        if(buy==1){
            return dp[ind][buy]=Math.max(-prices[ind]+solve(ind+1,0,prices,n,dp),solve(ind+1,1,prices,n,dp));
        }
        else{
            return dp[ind][buy]=Math.max(prices[ind]+solve(ind+2,1,prices,n,dp),solve(ind+1,0,prices,n,dp));
        }
    }
}