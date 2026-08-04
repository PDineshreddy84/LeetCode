class Solution {
    int n,m;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j] && func(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean func(char board[][],String word,int i,int j,int ind){
        if(ind==word.length())return true;
        if(i<0||j<0||i>=n||j>=m||board[i][j]!=word.charAt(ind)){
            return false;
        }
        char t=board[i][j];
        board[i][j]='$';
        if(func(board,word,i+1,j,ind+1))return true;
        if(func(board,word,i-1,j,ind+1))return true;
        if(func(board,word,i,j+1,ind+1))return true;
        if(func(board,word,i,j-1,ind+1))return true;
        board[i][j]=t;
        return false;
    }
}