class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r=ops.length;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            if(ops[i][0]<min1){
                min1=ops[i][0];
            }
            if(ops[i][1]<min2){
                min2=ops[i][1];
            }
        }
        if(min1!=Integer.MAX_VALUE && min2!=Integer.MAX_VALUE){
            return min1*min2;
        }
        return m*n;
    }
}