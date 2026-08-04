class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=nums[0],res=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                max=0;
            }
            max+=nums[i];
            res=Math.max(res,max);
        }
        return res;
    }
}