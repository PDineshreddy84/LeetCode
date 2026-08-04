class Solution {
    public int findMin(int[] nums) {
        int pivot=findPivot(nums);
        return nums[pivot+1];
    }
    public static int findPivot(int nums[]){
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m<r && nums[m]>nums[m+1]){
                return m;
            }
            if(m>l && nums[m]<nums[m-1]){
                return m-1;
            }
            if(nums[m]<nums[l]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
}