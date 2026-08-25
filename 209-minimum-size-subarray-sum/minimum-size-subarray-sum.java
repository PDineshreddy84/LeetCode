class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minWindowLen=Integer.MAX_VALUE;
        int n=nums.length;
        int currentSum=0;
        int l=0,r=0;
        int currentWindow=0;
        while(r<n){
                currentSum+=nums[r];
            while(currentSum>=target){
                currentWindow=r-l+1;
                currentSum-=nums[l];
                l++;
                minWindowLen=Math.min(minWindowLen,currentWindow);
            }
            r++;
        }
        return (minWindowLen==Integer.MAX_VALUE)?0:minWindowLen;
    }
}