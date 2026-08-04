class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ts=0,ls=0;
        for(int ele:nums)ts+=ele;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int vl=(nums[i]*i)-ls;
            int vr=ts-ls-(nums[i]*(n-i));
            ls+=nums[i];
            nums[i]=vl+vr;
        }
        return nums;
    }
}