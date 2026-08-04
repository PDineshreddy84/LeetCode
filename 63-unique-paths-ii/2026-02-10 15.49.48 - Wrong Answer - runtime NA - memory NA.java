class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        Arrays.fill(dp[0],1);
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=-1;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(dp[i][j]==-1)continue;
                int up=dp[i-1][j]!=-1?dp[i-1][j]:0;
                int left=dp[i][j-1]!=-1?dp[i][j-1]:0;
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1]==-1?0:dp[m-1][n-1];
    }
}