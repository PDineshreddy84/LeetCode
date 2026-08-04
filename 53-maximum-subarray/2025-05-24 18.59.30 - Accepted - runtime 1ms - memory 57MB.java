class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        int res=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max+nums[i],nums[i]);
            res=Math.max(max,res);
        }
        return res;
    }
}