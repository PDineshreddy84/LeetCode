class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans1=solve(nums,k);
        int ans2=solve(nums,k-1);
        return ans1-ans2;
    }
    int solve(int nums[],int k){
        int n=nums.length;
        int l=0,r=0,c=0,s=0;
        while(r<n){
            s+=nums[r]%2;
            while(s>k){
                s-=nums[l]%2;
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}