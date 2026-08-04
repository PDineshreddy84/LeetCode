class Solution {
    public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n1,n2,s,t,dp);
    }
    int solve(int i,int j,String s,String t,int dp[][]){
        if(j==0)return 1;
        if(i==0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i-1)==t.charAt(j-1)){
            return dp[i][j]=solve(i-1,j-1,s,t,dp)+solve(i-1,j,s,t,dp);
        }
        return dp[i][j]=solve(i-1,j,s,t,dp);
    }
}