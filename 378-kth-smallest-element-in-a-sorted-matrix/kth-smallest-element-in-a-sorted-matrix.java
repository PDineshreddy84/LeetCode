class Solution {
    public int kthSmallest(int[][] matrix, int k) {
       int n=matrix.length;
       int l=matrix[0][0],r=matrix[n-1][n-1];
       while(l<=r){
        int m=l+(r-l)/2;
        int c=solve(matrix,m);
        if(c<k){
            l=m+1;
        }
        else{
            r=m-1;
        }
       }
       return l;
    }
    int solve(int matrix[][],int m){
        int n=matrix.length,c=0;
        for(int i=0;i<n;i++){
            c+=upperBound(matrix[i],m);
        }
        return c;
    }
    int upperBound(int arr[],int t){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=t){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return l;
    }
}