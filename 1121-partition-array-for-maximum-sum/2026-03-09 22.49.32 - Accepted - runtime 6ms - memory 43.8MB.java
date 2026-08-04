class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(arr,0,n,dp,k);
    }
    int solve(int arr[],int i,int n,int dp[],int k){
        if(i==n)return 0;
        if(dp[i]!=-1)return dp[i];
        int max=0,l=0,sum=0,maxP=0;
        for(int j=i;j<Math.min(n,i+k);j++){
            max=Math.max(max,arr[j]);
            l++;
            sum=(max*l)+solve(arr,j+1,n,dp,k);
            maxP=Math.max(maxP,sum);
        }
        return dp[i]=maxP;
    }
}