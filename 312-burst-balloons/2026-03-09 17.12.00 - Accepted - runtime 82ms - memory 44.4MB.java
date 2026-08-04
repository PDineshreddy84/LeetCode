class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        List<Integer>l=new ArrayList<>();
        l.add(1);
        for(int ele:nums)l.add(ele);
        l.add(1);
        int dp[][]=new int[n+3][n+3];
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                int max=Integer.MIN_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=l.get(i-1)*l.get(ind)*l.get(j+1)+dp[i][ind-1]+dp[ind+1][j];
                    max=Math.max(max,cost);
                }
                dp[i][j]=max;
            }
        }
        return dp[1][n];
    }
    int solve(int i,int j,List<Integer>l,int dp[][]){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int max=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=l.get(i-1)*l.get(ind)*l.get(j+1)+solve(i,ind-1,l,dp)+solve(ind+1,j,l,dp);
            max=Math.max(max,cost);
        }
        return dp[i][j]=max;
    }
}