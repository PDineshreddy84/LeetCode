class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=nums[0],res=nums[0];
        for(int i=1;i<n-1;i++){
            max+=nums[i];
            if(i==n-2){
                max+=nums[n-1];
            }
            res=Math.max(res,max);
            if(nums[i]>nums[i+1]){
                max=0;
            }
        }
        return res;
    }
}