class Solution {
    public void rotate(int[][] matrix) {
        int k=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i<j){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
                }
            }
        }
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix.length;j++){
                int t=matrix[j][i];
                matrix[j][i]=matrix[j][k-i];
                matrix[j][k-i]=t;   
            }
        }
    }
}