class Solution {
    public int thirdMax(int[] nums) {
        int m1=-1,m2=-1,m3=-1;
        if(nums.length==1){
            return nums[0];
        }
        else if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        for(int i=0;i<nums.length;i++){
          if(nums[i]>m1){
            m2=m1;
            m1=nums[i];
          }
          else if(nums[i]>m2 && nums[i]<m1){
            m3=m2;
            m2=nums[i];
          }
          else if(nums[i]>m3 && nums[i]<m2){
            m3=nums[i];
          }
        }
        if(m3!=-1){
            return m3;
        }
        return m1;
    }
}