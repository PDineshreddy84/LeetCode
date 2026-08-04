class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
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