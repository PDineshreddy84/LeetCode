class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int req=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                req=i+1;
                break;
            }
        }
        if(req==-1){
            return true;
        }
        if(nums[n-1]>nums[0]){
            return false;
        }
        for(int i=req;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
}