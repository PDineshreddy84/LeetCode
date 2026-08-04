class Solution {
    int n;
    Integer dp[];
    public boolean canReach(String s, int minJump, int maxJump) {
        n=s.length();
        dp=new Integer[n];
        return solve(s,0,minJump,maxJump);
    }
    boolean solve(String s,int i,int minJump,int maxJump){
        if(i>=n)return false;
        if(i==n-1)return true;
        if(dp[i]!=null)return dp[i]==1;
        for(int j=i+1;j<n;j++){
            if(s.charAt(j)=='0'){
                if(j<=Math.min(i+maxJump,n-1) && j>= (i+minJump)){
                    if(solve(s,j,minJump,maxJump)){
                        dp[i]=1;
                        return true;
                    }
                    else{
                        dp[i]=0;
                    }
                }
            }
        }
        return false;
    }
}