class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length,l=0,res=0;
        long sum=0l;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while((long)nums[r]*(r-l+1)>(long)(sum+k)){
                sum-=nums[l];
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}