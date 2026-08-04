class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        if(grid.length<=1 || grid[0].length<=1){
            if(grid[0][0] != grid[1][0]){
                return false;
            }
        }
        int arr1[]=new int[grid.length];
        int arr2[]=new int[grid[0].length];
        int l=Math.max(grid.length,grid[0].length);
        int m=0;
       for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[0].length;j++){
               arr1[i]+=grid[i][j];
               arr2[j]+=grid[i][j];
               }
       }
        int c1=0,c2=0;
        for(int i=0;i<l;i++){
            if(i<grid.length-1){
             if(arr1[i]!=arr1[i+1]){
                c1++;
            }}
            if(i<grid[0].length-1){
            if(arr2[i]!=arr2[i+1]){
                c2++;
            }
            }
        }
        if(c1>0 && c2>0){
            return false;
        }
        return true;
    }
}