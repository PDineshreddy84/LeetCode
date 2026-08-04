class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int ahead[]=new int[2];
        for(int ind=n-1;ind>=0;ind--){
            int curr[]=new int[2];
            for(int buy=0;buy<2;buy++){
                if(buy==1){
                    curr[buy]=Math.max(-prices[ind]-fee+ahead[0],ahead[1]);
                }
                else{
                    curr[buy]=Math.max(prices[ind]+ahead[1],ahead[0]);
                }
            }
            ahead=curr;
        }
        return ahead[1];
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