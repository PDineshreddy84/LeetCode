class Solution {
    public int longestOnes(int[] nums, int k) {
         int n=nums.length;
        int l=0,r=0,cz=0,c=0;
        while(r<n){
            if(nums[r]==0){
                cz++;
            }
            if(cz>k){
                if(nums[l]==0){
                    cz--;
                }
                l++;
            }
            c=Math.max(c,r-l+1);
            r++;
        }
        return c;
    }
}