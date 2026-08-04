class Solution {
   Integer dp[];
    boolean flag=false;
    public int maximumJumps(int[] nums, int target) {
        int n=nums.length;
        dp=new Integer[n];
        int t=-target;
        int ans=solve(nums,n,target,t,0);
        if(flag)return ans;
        return -1;
    }
    public int solve(int nums[],int n,int tarR,int tarL,int i){
        if(i>n)return -1;
        if(i==n-1){
            flag=true;
            return 0;
        }
        if(dp[i]!=null)return dp[i];
        int res=0;
        for(int j=i+1;j<n;j++){
            if((nums[j]-nums[i])<=tarR && (nums[j]-nums[i])>=tarL){
                res=Math.max(res,solve(nums,n,tarR,tarL,j)+1);
            }
        }
        return dp[i]=res;
    }
}