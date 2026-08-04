class Solution {
    static int n=33;
     static List<List<Integer>>ans=new ArrayList<>();
     static int mat[][]=new int[n][n];
    static{
        for(int i=0;i<n;i++){
            mat[i][0]=1;
            mat[i][i]=1;
        }
        for(int i=0;i<n;i++){
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i>0 && j>0 && mat[i][j]==0){
                    mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
                }
                if(mat[i][j]!=0){
                    l.add(mat[i][j]);
                }
            }
            ans.add(l);
        }
    }
    public List<Integer> getRow(int rowIndex) {
        return ans.get(rowIndex);
    }
}