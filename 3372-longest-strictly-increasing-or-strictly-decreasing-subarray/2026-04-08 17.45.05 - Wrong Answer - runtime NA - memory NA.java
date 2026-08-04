class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int msi=1,msd=1;
        int n=nums.length;
        int si=1,sd=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sd++;
                si=0;
            }
            else if(nums[i]<nums[i-1]){
                si++;
                sd=0;
            }
            msi=Math.max(msi,si);
            msd=Math.max(msd,sd);
        }
        return Math.max(msi,msd);
    }
}