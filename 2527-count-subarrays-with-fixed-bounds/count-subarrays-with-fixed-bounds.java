class Solution {
    public long countSubarrays(int[] nums, int mink, int maxk) {
        int culI=-1;
        int maxI=-1;
        int minI=-1;
        int n=nums.length;
        long ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]<mink || nums[i]>maxk){
                culI=i;
            }
            if(nums[i]==mink){
                minI=i;
            }
            if(nums[i]==maxk){
                maxI=i;
            }
            long temp=Math.min(minI,maxI)-culI;
            ans=ans+((temp<0)?0:temp);
        }
        return ans;
    }
}