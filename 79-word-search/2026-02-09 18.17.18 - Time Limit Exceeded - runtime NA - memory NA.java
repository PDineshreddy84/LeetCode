class Solution {
    int n,m;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        StringBuilder sb=new StringBuilder();
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(func(sb,board,word,vis,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean func(StringBuilder sb,char board[][],String word,int vis[][],int i,int j){
        sb.append(board[i][j]+"");
        if(sb.toString().equals(word))return true;
        vis[i][j]=1;
        if(isSafe(vis,i+1,j)){
            if(func(sb,board,word,vis,i+1,j))return true;
        }
        if(isSafe(vis,i-1,j)){
            if(func(sb,board,word,vis,i-1,j))return true;
        }
        if(isSafe(vis,i,j+1)){
            if(func(sb,board,word,vis,i,j+1))return true;
        }
        if(isSafe(vis,i,j-1)){
            if(func(sb,board,word,vis,i,j-1))return true;
        }
        sb.deleteCharAt(sb.length()-1);
        vis[i][j]=0;
        return false;
    }
    boolean isSafe(int vis[][],int i,int j){
        if(i>=0&&j>=0&&i<n&&j<m&&vis[i][j]==0)return true;
        return false;
    }
}