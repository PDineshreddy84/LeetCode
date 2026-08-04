class Solution {
    Long dp[][];
    public boolean predictTheWinner(int[] nums) {
        long t=0;
        int n=nums.length;
        dp=new Long[n][n];
        for(int num:nums){
            t+=num;
        }
        long p1=solve(0,nums.length-1,nums);
        return 2*p1>=t;
    }
    long solve(int i,int j,int nums[]){
        if(i>j)return 0;
        if(i==j)return nums[i];
        if(dp[i][j]!=null)return dp[i][j];
        long take_i=nums[i]+Math.min(solve(i+2,j,nums),solve(i+1,j-1,nums));
        long take_j=nums[j]+Math.min(solve(i,j-2,nums),solve(i+1,j-1,nums));
        return dp[i][j]=Math.max(take_i,take_j);
    }
}