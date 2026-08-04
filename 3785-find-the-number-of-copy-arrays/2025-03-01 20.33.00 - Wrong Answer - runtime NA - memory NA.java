class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int min=0;
        for(int i=0;i<bounds.length;i++){
            for(int j=0;j<2;j++){
               if(bounds[i][1]-bounds[i][0]<min){
                   min=bounds[i][1]-bounds[i][0];
               }
            }}
            if(min==0){
                return 0;
            }
            else
                return min+1;
    }
}