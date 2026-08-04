class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n+1][2][3];
       for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<2;buy++){
                for(int cap=1;cap<3;cap++){
                    if(buy==1){
                        dp[ind][buy][cap]=Math.max(-prices[ind]+dp[ind+1][0][cap],dp[ind+1][1][cap]);
                    }
                    else{
                        dp[ind][buy][cap]=Math.max(prices[ind]+ dp[ind+1][1][cap-1],dp[ind+1][0][cap]);
                    }
                }
            }
       }
       return dp[0][1][2];
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