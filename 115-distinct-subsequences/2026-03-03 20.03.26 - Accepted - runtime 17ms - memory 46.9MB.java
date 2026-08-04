class Solution {
    public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int prev[]=new int[n2+1];
        prev[0]=1;
        for(int i=1;i<=n1;i++){
            int curr[]=new int[n2+1];
            curr[0]=1;
            for(int j=1;j<=n2;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    curr[j]=prev[j-1]+prev[j];
                }
                else{
                    curr[j]=prev[j];
                }
            }
            prev=curr;
        }
        return prev[n2];
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