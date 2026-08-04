class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        String rev=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==rev.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
    public int lcs(String s1,String s2,int i1,int i2,int dp[][]){
        if(i1==0 || i2==0)return 0;
        if(dp[i1][i2]!=-1)return dp[i1][i2];
        if(s1.charAt(i1-1)==s2.charAt(i2-1))return dp[i1][i2]=1+lcs(s1,s2,i1-1,i2-1,dp);
        else return dp[i1][i2]=Math.max(lcs(s1,s2,i1-1,i2,dp),lcs(s1,s2,i1,i2-1,dp));
    }
}