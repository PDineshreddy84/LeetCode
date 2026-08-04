class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length,sum=0,l=0,res=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while((r-l+1)*nums[r]>sum+k){
                sum-=nums[l];
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}