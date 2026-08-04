class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int ct[]=new int[n];
        int maxLen=1;
        Arrays.fill(dp,1);
        Arrays.fill(ct,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[i]<1+dp[j]){
                    dp[i]=1+dp[j];
                    ct[i]=ct[j];
                }
                else if(dp[i]==1+dp[j]){
                    ct[i]+=ct[j];
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(dp[i]==maxLen){
                c+=ct[i];
            }
        }
        return c;
    }
}