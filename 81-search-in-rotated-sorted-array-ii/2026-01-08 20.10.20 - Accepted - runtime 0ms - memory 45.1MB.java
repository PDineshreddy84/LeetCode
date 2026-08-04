class Solution {
    public boolean search(int[] nums, int t) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==t){
                return true;
            }
            if(nums[l]==nums[m] && nums[m]==nums[h]){
                l++;
                h--;
                continue;
            }
            if(nums[l]<=nums[m]){
                if(nums[l]<=t && t<=nums[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<=t&&t<=nums[h]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }   
        }
        return false;
    //     int pivot=findPivot(nums);
    //     if(pivot==-1){
    //         return binarySearch(nums,target,0,nums.length-1);
    //     }
    //     if(nums[pivot]==target){
    //         return true;
    //     }
    //     if(target>=nums[0]){
    //         return binarySearch(nums,target,0,pivot-1);
    //     }
    //     return binarySearch(nums,target,pivot+1,nums.length-1);
    // }
    // public static int findPivot(int nums[]){
    //     int l=0,r=nums.length-1;
    //     while(l<=r){
    //         int m=l+(r-l)/2;
    //         if(m<r && nums[m]>nums[m+1]){
    //             return m;
    //         }
    //         if(m>l && nums[m]<nums[m-1]){
    //             return m-1;
    //         }
    //         if(nums[m]==nums[l] && nums[m]==nums[r]){
    //             if(l<nums.length-1 && nums[l]>nums[l+1]){
    //                 return l;
    //             }
    //             if(r>0 && nums[r]<nums[r-1]){
    //                 return r-1;
    //             }
    //             l++;
    //             r--;
    //         }
    //         else if(nums[l]<nums[m] || (nums[l]==nums[m] && nums[m] > nums[r])){
    //             l=m+1;
    //         }
    //         else{
    //             r=m-1;
    //         }
    //     }
    //     return -1;
    // }
    // public static boolean binarySearch(int nums[],int target,int l,int r){
    //     while(l<=r){
    //         int m=l+(r-l)/2;
    //         if(target<nums[m]){
    //             r=m-1;
    //         }
    //         else if(target>nums[m]){
    //             l=m+1;
    //         }
    //         else{
    //             return true;
    //         }
    //     }
    //     return false;
    }
}