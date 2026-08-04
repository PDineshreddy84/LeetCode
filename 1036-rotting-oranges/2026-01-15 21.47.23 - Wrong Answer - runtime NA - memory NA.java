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
    public int orangesRotting(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int c=0,co=0;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    co++;
                }
            }
        }
        if(co==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]==2){
                    c+=bfs(grid,i,j,vis);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==false && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return c;
    }
    public int bfs(int grid[][],int i,int j,boolean vis[][]){
        int c=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j]=true;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                int row=q.peek().first;
                int col=q.peek().second;
                q.remove();
                if(row-1>=0 && row-1<n && col>=0 && col<m && vis[row-1][col]==false && grid[row-1][col]==1){
                    vis[row-1][col]=true;
                    q.add(new Pair(row-1,col));
                }
                if(row+1>=0 && row+1<n && col>=0 && col<m && vis[row+1][col]==false && grid[row+1][col]==1){
                    vis[row+1][col]=true;
                    q.add(new Pair(row+1,col));
                }
                if(row>=0 && row<n && col-1>=0 && col-1<m && vis[row][col-1]==false && grid[row][col-1]==1){
                    vis[row][col-1]=true;
                    q.add(new Pair(row,col-1));
                }
                if(row>=0 && row<n && col+1>=0 && col+1<m && vis[row][col+1]==false && grid[row][col+1]==1){
                    vis[row][col+1]=true;
                    q.add(new Pair(row,col+1));
                }
            }
            c++;
        }
        return c-1;
    }
}
// 
// 
// 