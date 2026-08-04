class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        if(n==2){
            return nums[0]>nums[1]?nums[0]-nums[1]:nums[1]-nums[0];
        }
        int max=nums[0],min=nums[0];
        for(int i=1;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return (max-min)*k;
    }
}