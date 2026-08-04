class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(res==0){
                res=1;
            }
            res=Math.max(nums[i],res*nums[i]);
            max=Math.max(res,max);
        }
        return max;
    }
}