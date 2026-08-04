class Solution {
    public int countNegatives(int[][] grid) {
        int res=0;
        for(int i=0;i<grid.length;i++){
            res+=help(grid[i]);
        }
        return res;
    }
    public static int help(int arr[]){
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]>0){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        if(arr[l]>=0){
            return 0;
        }
        return n-l;
    }
}