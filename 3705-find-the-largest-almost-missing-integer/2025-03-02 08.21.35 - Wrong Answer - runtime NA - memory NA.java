class Solution {
    public int largestInteger(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
        if(nums[i]>nums[nums.length-1-i]){
            return nums[0];
        }
        else{
            return nums[nums.length-1-i];
        }
        }
        return -1;
    }
}