class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ahead[]=new int[5];
        for(int ind=n-1;ind>=0;ind--){
            int curr[]=new int[5];
            for(int trans=0;trans<4;trans++){
                if(trans%2==0){
                    curr[trans]=Math.max(-prices[ind]+ahead[trans+1],ahead[trans]);
                }
                else{
                   curr[trans]=Math.max(prices[ind]+ahead[trans+1],ahead[trans]);
                }
            }
            ahead=curr;
        }
        return ahead[0];
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