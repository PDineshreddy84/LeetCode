class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int r=0,l=0,cz=0,co=0,ml=0,sum=0;
        while(r<n){
            if(nums[r]==1){
                co++;
            }
            else{
                cz++;
            }
            while(cz>1){
                if(l<n && nums[l]==0){
                    cz--;
                }
                l++;
            }
            if(cz<=1){
                ml=Math.max(ml,r-l+1);
            }
            r++;
        }
        return ml-1;
    }
}