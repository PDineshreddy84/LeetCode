class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(0<nums[m]){
                r=m-1;
            }
            else if(0>nums[m]){
                l=m+1;
            }
            else{
                l++;
                r--;
            }
        }
        int p=n-l;
        int ne=r+1;
        return Math.max(p,ne);
    }
}