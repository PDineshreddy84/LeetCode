class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft=0,sumRight=0,sumTotal=0;
       for(int num: nums){
        sumTotal+=num;
       }
       for(int i=0;i<nums.length;i++){
        sumRight=sumTotal-sumLeft-nums[i];
        if(sumLeft==sumRight){
            return i;
        }
        sumLeft+=nums[i];
       }
       return -1;
    }
}