class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0],min=nums[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return (max-min)*k;
    }
}