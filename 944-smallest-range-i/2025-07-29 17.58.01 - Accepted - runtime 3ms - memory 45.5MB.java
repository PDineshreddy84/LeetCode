class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int diff=max-min;
        int res=diff-2*k;
        return Math.max(0,res);
    }
}