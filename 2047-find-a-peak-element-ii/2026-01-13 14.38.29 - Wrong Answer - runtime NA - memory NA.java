class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int cl=mat[0].length;
        int l=0,h=mat.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            int maxRowIndex=maxElement(mat,n,m);
            int left=(m-1)>=0?mat[maxRowIndex][m-1]:-1;
            int right=(m+1)<cl?mat[maxRowIndex][m+1]:-1;
            if(mat[maxRowIndex][m]>left && mat[maxRowIndex][m]>right){
                return new int[]{maxRowIndex,m};
            }
            else if(mat[maxRowIndex][m]<left){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return new int[]{-1,-1};
        }
    int maxElement(int mat[][],int n,int m){
        int index=-1,maxValue=-1;
        for(int i=0;i<n;i++){
            if(maxValue<mat[i][m]){
                maxValue=mat[i][m];
                index=i;
            }
        }
        return index;
    }
}