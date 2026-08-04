class Solution {
    int m,n;
    public int numEnclaves(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
         for(int row = 0; row < m; row++)
        {
            dfs(grid,row, 0);
            dfs(grid,row, n-1);
        }

        for(int col = 0; col < n; col++)
        {
            dfs(grid,0, col);
            dfs(grid,m-1, col);
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    c++;
                }
            }
        }
        return c;
    }
    public void dfs(int grid[][],int i,int j){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]!=1)return;
        grid[i][j]=2;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}