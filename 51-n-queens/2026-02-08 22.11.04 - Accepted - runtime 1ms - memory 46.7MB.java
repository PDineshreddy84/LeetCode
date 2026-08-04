class Solution {
    public List<List<String>> solveNQueens(int n) {
        int upperDiagnol[]=new int[2*n-1];
        int lowerDiagnol[]=new int[2*n-1];
        int leftRow[]=new int[n];
        char board[][]=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        List<List<String>>res=new ArrayList<>();
        solve(0,leftRow,upperDiagnol,lowerDiagnol,board,res,n);
        return res;
    }
    public void solve(int col,int[] leftRow,int[] upperDiagnol,int[] lowerDiagnol,char board[][],List<List<String>>res,int n){
        if(col==n){
            List<String>t=new ArrayList<>();
            for(int i=0;i<n;i++){
                t.add(new String(board[i]));
            }
            res.add(t);
            return;
        }
        for(int row=0;row<n;row++){
            if(leftRow[row]==0 && upperDiagnol[n-1+col-row]==0 && lowerDiagnol[row+col]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagnol[n-1+col-row]=1;
                lowerDiagnol[row+col]=1;
                solve(col+1,leftRow,upperDiagnol,lowerDiagnol,board,res,n);
                board[row][col]='.';
                leftRow[row]=0;
                upperDiagnol[n-1+col-row]=0;
                lowerDiagnol[row+col]=0;
            }
        }
    }
}