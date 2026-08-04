class Solution {
    public boolean isMatch(String s, String p) {
        int n1=p.length();
        int n2=s.length();
        boolean dp[][]=new boolean[n1+1][n2+1];
        return solve(n1-1,n2-1,p,s,dp);
    }
    boolean solve(int i,int j,String p,String s,boolean dp[][]){
        if(i<0 && j<0)return true;
        if(i<0)return false;
        if(j<0){
            for(int ii=0;ii<=i;ii++){
                if(p.charAt(ii)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j]==true)return true;
        if(p.charAt(i)==s.charAt(j) || p.charAt(i)=='?'){
            return dp[i][j]=solve(i-1,j-1,p,s,dp);
        }
        if(p.charAt(i)=='*'){
            return dp[i][j]=(solve(i-1,j,p,s,dp)||solve(i,j-1,p,s,dp));
        }
        return false;
    }
}