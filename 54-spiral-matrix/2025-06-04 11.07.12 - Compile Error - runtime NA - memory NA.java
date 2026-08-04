class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>l=new ArrayList<>();
       int t=0,b=matrix.length-1,l=0,r=matrix[0].length-1;
       if(matrix.length==0){
        return l;
       }
       else{
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                l.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                l.add(matrix[i][r]);
            }
            r++;
            for(int i=r;i>=l;i--){
                l.add(matrix[b][i]);
            }
            b--;
            for(int i=b;i>=t;i--){
                l.add(matrix[i][l]);
            }
            l--;
        }
       }
       return l;
    }
}