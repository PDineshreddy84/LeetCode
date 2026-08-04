class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<n-1;i++){
            int take=prev2+nums[i];
            int notTake=prev1;
            int curr=Math.max(take,notTake);
            prev2=prev1;
            prev1=curr;
        }
        int ans1=prev1;
        prev1=nums[1];
        prev2=0;
        for(int i=2;i<n;i++){
            int take=prev2+nums[i];
            int notTake=prev1;
            int curr=Math.max(take,notTake);
            prev2=prev1;
            prev1=curr;
        }
        int ans2=prev1;
        return Math.max(ans1,ans2);
    }
}