class Solution {
    public int thirdMax(int[] nums) {
        int m1=nums[0],m2=0,m3=0;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i=1;i<nums.length;i++){
          if(m1<nums[i]){
            m1=nums[i];
          }
          else if(m2<nums[i] && m2<m1){
            m2=nums[i];
          }
          else if(m3<nums[i] && m3<m2){
            m3=nums[i];
          }
          else{
            m3=nums[nums.length-1];
          }
        }
        return m3;
    }
}