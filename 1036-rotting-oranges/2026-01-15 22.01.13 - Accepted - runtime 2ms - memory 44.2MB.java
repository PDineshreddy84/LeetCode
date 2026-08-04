class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    int n;
    int m;
    int c;
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int co=0;
        boolean vis[][]=new boolean[n][m];
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    co++;
                }
                if(grid[i][j]==2){
                    vis[i][j]=true;
                    q.add(new Pair(i,j));
                }
            }
        }
        if(co==0){
            return 0;
        }
        bfs(grid,vis,q);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return c-1;
    }
    public void bfs(int grid[][],boolean vis[][],Queue<Pair>q){
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                int row=q.peek().first;
                int col=q.peek().second;
                q.remove();
                if(row-1>=0 && vis[row-1][col]==false && grid[row-1][col]==1){
                    vis[row-1][col]=true;
                    q.add(new Pair(row-1,col));
                }
                if(row+1<n && vis[row+1][col]==false && grid[row+1][col]==1){
                    vis[row+1][col]=true;
                    q.add(new Pair(row+1,col));
                }
                if(col-1>=0 && vis[row][col-1]==false && grid[row][col-1]==1){
                    vis[row][col-1]=true;
                    q.add(new Pair(row,col-1));
                }
                if(col+1<m && vis[row][col+1]==false && grid[row][col+1]==1){
                    vis[row][col+1]=true;
                    q.add(new Pair(row,col+1));
                }
            }
            c++;
        }
    }
}