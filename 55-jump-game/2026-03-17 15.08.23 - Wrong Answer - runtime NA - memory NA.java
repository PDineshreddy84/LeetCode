class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        return solve(0,n,nums);
    }
    boolean solve(int i,int n,int nums[]){
        if(i>=n-1)return true;
        if(nums[i]==0)return false;
        if(solve(i+nums[i],n,nums)||solve(i+1,n,nums))return true;
        return false;
    }
}