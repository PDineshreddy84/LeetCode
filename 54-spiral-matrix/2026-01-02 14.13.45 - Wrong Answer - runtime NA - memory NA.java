class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>li=new ArrayList<>();
       int t=0,b=matrix.length-1,l=0,r=matrix[0].length-1;
       if(matrix.length==0){
        return li;
       }
       else{
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                li.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                li.add(matrix[i][r]);
            }
            r--;
            if(t<b){
            for(int i=r;i>=l;i--){
                li.add(matrix[b][i]);
            }
            b--;
            }
            if(l<r){
            for(int i=b;i>=t;i--){
                li.add(matrix[i][l]);
            }
            l++;
            }
        }
       }
       return li;
    }
}