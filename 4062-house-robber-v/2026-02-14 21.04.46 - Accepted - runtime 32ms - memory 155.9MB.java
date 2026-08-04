class Solution {
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        long dp[]=new long[n];
        Arrays.fill(dp,-1);
        return solve(nums,colors,n-1,dp);
    }
    public long solve(int nums[],int colors[],int i,long dp[]){
        if(i<0)return 0;
        if(i==0)return nums[0];
        if(dp[i]!=-1)return dp[i];
        long pick;
        if(i>0 && colors[i]!=colors[i-1]){
             pick=nums[i]+solve(nums,colors,i-1,dp);
        }
        else{
             pick=nums[i]+solve(nums,colors,i-2,dp);
        }
        long notPick=solve(nums,colors,i-1,dp);
        return dp[i]=Math.max(pick,notPick);
    }
}