class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans1=solve(nums,goal);
        int ans2=solve(nums,goal-1);
        return ans1-ans2;
    }
    int solve(int nums[],int k){
        if(k<0)return 0;
        int l=0,r=0,n=nums.length;
        int c=0,s=0;
        while(r<n){
            s+=nums[r];
            while(s>k){
                s-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}