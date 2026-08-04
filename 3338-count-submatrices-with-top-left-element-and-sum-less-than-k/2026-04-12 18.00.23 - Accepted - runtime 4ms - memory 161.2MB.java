class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
                grid[i][j]=sum;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=grid[i][j]+grid[i-1][j];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(grid[i][j]<=k)c++;
            }
        }
        return c;
    }
}