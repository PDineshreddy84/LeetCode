class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ts=0,ls=0;
        for(int ele:nums)ts+=ele;
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int vl=(nums[i]*i)-ls;
            int vr=ts-ls-(nums[i]*(n-i));
            ls+=nums[i];
            ans[i]=vl+vr;
        }
        return ans;
    }
}