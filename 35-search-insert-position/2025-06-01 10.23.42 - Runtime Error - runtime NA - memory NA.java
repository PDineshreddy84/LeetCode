class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n;
        while(l<=r){
           int m=(l+r)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                r=m-1;
                if(nums[m-1]<target || m==0){
                    return m-1;
                }
            }
            else if(nums[m]<target){
                l=m+1;
                if(m==n-1 || nums[m+1]>target){
                    return m+1;
                }
            }
        }
        return n+1;
    }
}