class Solution {
    public int majorityElement(int[] nums) {
        int k=0,t=0;
        int count=1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[k]==nums[i+1]){
        count++;
       }}
       if(count>nums.length/2){
       t = nums[k];
       }
       else 
       {
        k++;
       }
    return t;
    }
}