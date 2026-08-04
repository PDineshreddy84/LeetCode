class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for(int i=0;i<n;i++)totalSum+=nums[i];
        if(totalSum%2!=0)return false;
        return solve(nums,n,totalSum/2);
    }
    public boolean solve(int nums[],int n,int k){
        boolean prev[]=new boolean[k+1];
        prev[0]=true;
        if(nums[0]<=k){
            prev[nums[0]]=true;
        }
        for(int ind=1;ind<n;ind++){
            boolean curr[]=new boolean[k+1];
            curr[0]=true;
            for(int target=1;target<=k;target++){
                boolean notTaken=prev[target];
                boolean taken=false;
                if(nums[ind]<=target){
                    taken=prev[target-nums[ind]];
                }
                curr[target]=taken||notTaken;
            }
            prev=curr;
        }
        return prev[k];
    }
}