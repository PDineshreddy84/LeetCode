class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    markR(mat,i);
                    markC(mat,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=0;
                }
            }
        }
    }
    public static void markR(int mat[][],int e){
        for(int i=0;i<mat.length;i++){
            if(mat[e][i]!=0){
                mat[e][i]=-1;
            }
        }
    }
    public static void markC(int mat[][],int e){
        for(int i=0;i<mat.length;i++){
            if(mat[i][e]!=0){
                mat[i][e]=-1;
            }
        }
    }
}