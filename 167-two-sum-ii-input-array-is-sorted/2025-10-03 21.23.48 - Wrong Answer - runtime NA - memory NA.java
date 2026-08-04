class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int l=i+1,r=nums.length-1-i;
            while(l<=r){
                int m=l+(r-l)/2;
                if(nums[i]+nums[m]==target){
                    return new int[]{i+1,m+1};
                }
                else if(target<nums[i]+nums[m]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}