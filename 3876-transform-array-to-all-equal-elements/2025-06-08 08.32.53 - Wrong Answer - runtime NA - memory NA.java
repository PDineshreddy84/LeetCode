class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        if(nums.length==1){
            return false;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==-1){
                nums[i]*=-1;
                nums[i+1]*=-1;
                k--;
            }
            if(k==0){
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1){
                return false;
            }
        }
        return true;
    }
}