class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r=ops.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                if(ops[i][j]<min){
                    min=ops[i][j];
                }
            }
        }
        if(min!=Integer.MAX_VALUE){
            return min*min;
        }
        return m*n;
    }
}