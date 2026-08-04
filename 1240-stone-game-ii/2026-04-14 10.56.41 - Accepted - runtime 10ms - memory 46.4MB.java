class Solution {
    Integer dp[][][];
    int n;
    public int stoneGameII(int[] piles) {
        n=piles.length;
       dp=new Integer[2][n+1][n+1];
       return solve(piles,1,0,1);
    }
    int solve(int piles[],int p,int i,int m){
        if(i>=n)return 0;
        if(dp[p][i][m]!=null)return dp[p][i][m];
        int res=(p==1)?-1:Integer.MAX_VALUE;
        int st=0;
        for(int x=1;x<=(Math.min(2*m,n-i));x++){
            st+=piles[x+i-1];
            if(p==1){
                res=Math.max(res,st+solve(piles,0,x+i,Math.max(m,x)));
            }
            else{
                res=Math.min(res,solve(piles,1,x+i,Math.max(m,x)));
            }
        }
        return dp[p][i][m]=res;
    }
}