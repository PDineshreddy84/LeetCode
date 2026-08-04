class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }
    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(target<nums[m]){
                r=m-1;
            }
            else if(target>nums[m]){
                l=m+1;
            }
            else{
                ans=m;
                if(findStartIndex){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
        }
        return ans;
    }
}