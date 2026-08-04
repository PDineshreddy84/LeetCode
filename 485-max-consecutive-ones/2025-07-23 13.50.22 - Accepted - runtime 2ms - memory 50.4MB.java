class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
                max++;
            }
            else{
                res=Math.max(res,max);
                max=0;
            }
        }
        return Math.max(max,res);
    }
}