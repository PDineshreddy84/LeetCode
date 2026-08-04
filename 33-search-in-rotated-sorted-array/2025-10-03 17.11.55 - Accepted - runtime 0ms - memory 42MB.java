class Solution {
    public int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1,nums.length-1);
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
    public static int binarySearch(int nums[],int target,int l,int r){
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<nums[m]){
                r=m-1;
            }
            else if(target>nums[m]){
                l=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}