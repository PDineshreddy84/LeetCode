class Solution {
   Integer dp[];
   int n;
    public int maximumJumps(int[] nums, int target) {
        n=nums.length;
        dp=new Integer[n];
        return solve(nums,target,0);
    }
    public int solve(int nums[],int target,int i){
        if(i==n-1){
            return 0;
        }
        if(dp[i]!=null)return dp[i];
        int ans=-1;
        for(int j=i+1;j<n;j++){
            long diff=nums[j]-nums[i];
            if(diff>=-target && diff<=target){
                int next=solve(nums,target,j);
                if(next!=-1)ans=Math.max(ans,next+1);
            }
        }
        return dp[i]=ans;
    }
}