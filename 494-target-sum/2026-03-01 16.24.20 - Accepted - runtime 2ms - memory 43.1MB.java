class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int t=0;
        for(int num:nums)t+=num;
        if((t+target)%2!=0 || Math.abs(target)>t)return 0;
        int nt=(t+target)/2;
        int dp[]=new int[nt+1];
        dp[0]=1;
        for(int num:nums){
            for(int j=nt;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[nt];
    }
}