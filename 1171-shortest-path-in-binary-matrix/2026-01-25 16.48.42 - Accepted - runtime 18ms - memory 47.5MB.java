class Solution {
    int m,n;
    public int shortestPathBinaryMatrix(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        if(grid[0][0]!=0 || grid[m-1][n-1]!=0){
            return -1;
        }
        int distance[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        distance[0][0]=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0,0));
        while(!q.isEmpty()){
            int dist=q.peek().dist;
            int row=q.peek().row;
            int col=q.peek().col;
            q.remove();
            for(int i=-1;i<2;i++){
                for(int j=-1;j<2;j++){
                    if(i==0 && j==0)continue;
                    int pr=row+i;
                    int pc=col+j;
                    int d=dist+1;
                   if(pr>=0 && pc>=0 && pr<m && pc<n && grid[pr][pc]==0 && distance[pr][pc]>d){
                        distance[pr][pc]=d;
                        q.add(new Pair(d,pr,pc));
                   }
                }
            }
        }
        return distance[m-1][n-1]!=Integer.MAX_VALUE?distance[m-1][n-1]+1:-1;
    }
}
class Pair{
    int dist,row,col;
    Pair(int dist,int row,int col){
        this.dist=dist;
        this.row=row;
        this.col=col;
    }
}