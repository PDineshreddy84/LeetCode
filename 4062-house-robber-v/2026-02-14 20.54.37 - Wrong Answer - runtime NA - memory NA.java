class Solution {
    public long rob(int[] nums, int[] colors) {
        Map<Integer,Integer>m=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            m.put(nums[i],colors[i]);
        }
        long dp[]=new long[n];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,m,dp);
    }
    public long solve(int nums[],int i,Map<Integer,Integer>m,long dp[]){
        if(i<0)return 0;
        if(i==0)return nums[0];
        if(dp[i]!=-1)return dp[i];
        long pick=nums[i];
        if(i>0 && m.get(nums[i])!=m.get(nums[i-1])){
            pick+=solve(nums,i-1,m,dp);
        }
        else{
            pick+=solve(nums,i-2,m,dp);
        }
        long notPick=solve(nums,i-1,m,dp);
        return dp[i]=Math.max(pick,notPick);
    }
}