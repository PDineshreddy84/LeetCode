class Solution {
    int m,n;
    public boolean containsCycle(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0){
                    char ch=grid[i][j];
                    if(dfs(grid,vis,ch,i,j)==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char grid[][],int vis[][],char ch,int i,int j){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!=ch){
            return false;
        }
        if(vis[i][j]==1){
            return true;
        }
        grid[i][j]='$';
        vis[i][j]=1;
        if(dfs(grid,vis,ch,i+1,j)==true){
            return true;
        }
        if(dfs(grid,vis,ch,i-1,j)==true){
            return true;
        }
        if(dfs(grid,vis,ch,i,j+1)==true){
            return true;
        }
        if(dfs(grid,vis,ch,i,j-1)==true){
            return true;
        }
        grid[i][j]=ch;
        return false;
    }
}