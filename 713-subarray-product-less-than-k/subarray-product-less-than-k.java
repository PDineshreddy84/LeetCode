class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long prod=1;
        int n=nums.length,l=0,r=0,c=0;
        while(r<n){
            prod*=nums[r];
            while(l<n && prod>=k){
                prod/=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}