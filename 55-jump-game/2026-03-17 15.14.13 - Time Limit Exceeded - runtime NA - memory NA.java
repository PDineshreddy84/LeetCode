class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        return solve(0,n,nums);
    }
    boolean solve(int i,int n,int nums[]){
        if(i>=n-1)return true;
        if(nums[i]==0)return false;
        for(int z=1;z<=nums[i];z++){
            if(solve(i+z,n,nums))return true;
        }
        if(solve(i+1,n,nums))return true;
        return false;
    }
}