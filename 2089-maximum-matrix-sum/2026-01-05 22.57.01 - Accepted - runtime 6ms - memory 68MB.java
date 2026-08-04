class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        long sum=0;
        int c=0;
        int min=1000000;
        int ele=1000000;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=Math.abs(matrix[i][j]);
                ele=matrix[i][j];
                if(matrix[i][j]<=0){
                    c++;
                    ele=-(ele);
                }
                    min=Math.min(min,ele);
            }
        }
        if(c%2==1){
            return sum-2*min;
        }
        return sum;
    }
}