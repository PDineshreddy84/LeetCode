class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=nums[0],max=nums[0];
        long n=nums.length;
        for(int i=1;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return (max-min)*k;
    }
}