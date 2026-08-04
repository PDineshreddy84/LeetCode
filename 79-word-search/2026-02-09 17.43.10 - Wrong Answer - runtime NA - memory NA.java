class Solution {
    public boolean exist(char[][] board, String word) {
        StringBuilder sb=new StringBuilder();
        int vis[][]=new int[board.length][board[0].length];
        return func(sb,board,word,vis);
    }
    public boolean func(StringBuilder sb,char board[][],String word,int vis[][]){
        if(sb.toString().equals(word))return true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(vis[i][j]==1)continue;
                if(sb.length()>word.length())return false;
                vis[i][j]=1;
                if(func(sb.append(board[i][j]+""),board,word,vis)==true)return true;
                vis[i][j]=0;
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return false;
    }
}