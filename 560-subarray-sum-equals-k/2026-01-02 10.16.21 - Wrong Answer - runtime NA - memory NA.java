class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int l=0;
        int c=0;
        for(int r=0;r<n;r++){
           while(sum>=k){
                sum-=nums[l];
                l++;
            }
            sum+=nums[r];
            if(nums[r]==k||sum==k){
                c++;
            }
        }
        return c;
    }
}