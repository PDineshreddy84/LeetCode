class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            i+=nums[i];
            if(i==n-1)return true;
            if(nums[i]==0 || i>=n)return false;
        }
        return false;
    }
}