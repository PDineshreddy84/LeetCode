class Solution {
    int m,n;
    public void solve(char[][] board) {
        m=board.length;
        n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i==0||j==0||i==m-1||j==n-1) && board[i][j]=='O'){
                    dfs(board,i,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='D'){
                    board[i][j]='O';
                }
            }
        }
    }
    public void dfs(char board[][],int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || board[i][j]!='O')return;
        board[i][j]='D';
        dfs(board,i+1,j);
        dfs(board,i-1,j);
        dfs(board,i,j+1);
        dfs(board,i,j-1);
    }
}