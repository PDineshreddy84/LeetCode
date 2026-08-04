class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int requiredRow=findRow(matrix,target);
        if(requiredRow==-1){
            return true;
        }
        return findTarget(matrix[requiredRow],target);
    }
    public static int findRow(int matrix[][],int target){
        int l=0,r=matrix.length-1;
        int c=matrix[0].length;
        while(l<r){
            int m=l+(r-l)/2;
            if(target==matrix[m][c-1]){
                return -1;
            }
            else if(target<matrix[m][c-1]){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
    public static boolean findTarget(int arr[],int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target){
                return true;
            }
            else if(target<arr[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return false;
    }
}