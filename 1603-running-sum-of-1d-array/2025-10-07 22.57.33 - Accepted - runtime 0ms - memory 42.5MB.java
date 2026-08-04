class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int s=0;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            s+=nums[i];
            res[i]=s;
        }
        return res;
    }
}