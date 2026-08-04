class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==j) || j==c-i-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}