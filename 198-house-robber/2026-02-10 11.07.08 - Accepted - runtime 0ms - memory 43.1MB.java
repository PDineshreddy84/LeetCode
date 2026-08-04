class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        solve(nums,n-1,dp);
        return dp[n-1];
    }
    int solve(int nums[],int ind,int dp[]){
        if(ind<0)return 0;
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int pick=nums[ind]+solve(nums,ind-2,dp);
        int notPick=solve(nums,ind-1,dp);
        return dp[ind]=Math.max(pick,notPick);
    }
}