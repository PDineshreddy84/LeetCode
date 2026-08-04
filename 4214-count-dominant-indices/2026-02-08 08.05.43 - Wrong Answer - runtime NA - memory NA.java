class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int suff[]=new int[n];
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            suff[i]=sum;
        }
        int c=0;
        for(int i=0;i<n-1;i++){
           int avg=(suff[i+1]/(n-i));
            if(nums[i]>avg){
                c++;
            }
        }
        return c;
    }
}