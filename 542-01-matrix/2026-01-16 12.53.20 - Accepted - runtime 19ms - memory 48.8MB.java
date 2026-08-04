class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans[][]=new int[m][n];
        boolean vis[][]=new boolean[m][n];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    vis[i][j]=true;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().column;
            int dis=q.peek().distance;
            q.remove();
            if(r-1>=0 && vis[r-1][c]==false && mat[r-1][c]==1){
                vis[r-1][c]=true;
                ans[r-1][c]=mat[r-1][c]+dis;
                q.add(new Pair(r-1,c,ans[r-1][c]));
            }
            if(r+1<m && vis[r+1][c]==false && mat[r+1][c]==1){
                vis[r+1][c]=true;
                ans[r+1][c]=mat[r+1][c]+dis;
                q.add(new Pair(r+1,c,ans[r+1][c]));
            }
            if(c-1>=0 && vis[r][c-1]==false && mat[r][c-1]==1){
                vis[r][c-1]=true;
                ans[r][c-1]=mat[r][c-1]+dis;
                q.add(new Pair(r,c-1,ans[r][c-1]));
            }
            if(c+1<n && vis[r][c+1]==false && mat[r][c+1]==1){
                vis[r][c+1]=true;
                ans[r][c+1]=mat[r][c+1]+dis;
                q.add(new Pair(r,c+1,ans[r][c+1]));
            }
        }
        return ans;
    }
}
class Pair{
    int row,column,distance;
    Pair(int row,int column,int distance){
        this.row=row;
        this.column=column;
        this.distance=distance;
    }
}