class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int n=nums.length;
        if(n==1)return true;
        while(i<n){
            i+=nums[i];
            if(i==n-1)return true;
            if(( i<n &&nums[i]==0 )|| i>=n)return false;
        }
        return false;
    }
}