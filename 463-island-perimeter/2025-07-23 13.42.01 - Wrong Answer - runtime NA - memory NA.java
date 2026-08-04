class Solution {
    public int islandPerimeter(int[][] grid) {
        int c=0,i=0;
        for(i=0;i<grid.length;i++){
            for(int j=0;i<grid[i].length;j++){
                if(grid[i][j]==1){
                    c++;
                    break;
                }
            }
        }
        return c*4;
    }
}