class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        double sum=0,max=Integer.MIN_VALUE;
        while(r<n){
            int len=r-l+1;
            sum+=nums[r];
            if(len>k){
                sum-=nums[l];
                l++;
            }
            len=r-l+1;
            if(len==k){
                max=Math.max(max,sum);
            }
            r++;
        }
        return max/k;
    }
}