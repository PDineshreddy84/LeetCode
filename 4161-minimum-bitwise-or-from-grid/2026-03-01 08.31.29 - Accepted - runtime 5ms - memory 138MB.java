class Solution {
    public int minimumOR(int[][] grid) {
        int l=0,r=(1<<30)-1;
        int ans=r;
        while(l<=r){
            int m=l+(r-l)/2;
            if(isPossible(grid,m)){
                ans=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean isPossible(int grid[][],int t){
        for(int row[]:grid){
            boolean f=false;
            for(int val:row){
                if((val|t)==t){
                    f=true;
                    break;
                }
            }
            if(!f)return false;
        }
        return true;
    }
}