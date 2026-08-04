class Solution {
   Integer dp[][];
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        dp=new Integer[n][n];
        int t=-target;
        if(target==0)return -1;
        return solve(nums,n,target,t,0);
    }
    public int solve(int nums[],int n,int tarR,int tarL,int i){
        if(i>n)return -1;
        if(i==n)return 0;
        if(dp[i][tarR]!=null)return dp[i][tarR];
        int res=0;
        for(int j=i+1;j<n;j++){
            if((nums[j]-nums[i])<=tarR && (nums[j]-nums[i])>=tarL){
                res=Math.max(res,solve(nums,n,tarR,tarL,j)+1);
            }
        }
        return dp[i][tarR]=res;
    }
}