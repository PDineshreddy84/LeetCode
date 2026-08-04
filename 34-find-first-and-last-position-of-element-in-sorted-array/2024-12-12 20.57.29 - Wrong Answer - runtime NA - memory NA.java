class Solution {
    public int[] searchRange(int[] nums, int target) {
        int t[]=new int[2]; 
        t[0]=-1;
        t[1]=-1;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
              t[a]=i;
              a++;
            }
        }
        return t;
    }
}