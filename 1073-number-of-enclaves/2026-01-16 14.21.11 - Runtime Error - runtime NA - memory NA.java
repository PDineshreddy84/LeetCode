class Solution {
    int m,n;
    public int numEnclaves(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int co=0;
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    co++;
                }
            }
        }
        if(co==0)return 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0||j==0||i==m-1||j==n-1) && grid[i][j]==1){
                    dfs(grid,i,j);
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
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