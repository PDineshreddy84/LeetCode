class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int max=0,l=0,sum=0,maxP=0;
            for(int j=i;j<Math.min(n,i+k);j++){
                max=Math.max(max,arr[j]);
                l++;
                sum=(max*l)+dp[j+1];
                maxP=Math.max(maxP,sum);
            }
            dp[i]=maxP;
        }
        return dp[0];
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