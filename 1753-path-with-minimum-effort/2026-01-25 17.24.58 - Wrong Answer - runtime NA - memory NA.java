class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int distance[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(0,0));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            q.remove();
            for(int i=0;i<4;i++){
                int newr=dr[i]+row;
                int newc=dc[i]+col;
                if(newr>=0 && newc>=0 && newr<m && newc<n){
                    int absDiff=Math.abs(heights[newr][newc]-heights[row][col]);
                    if(absDiff<distance[newr][newc]){
                        distance[newr][newc]=absDiff;
                        q.add(new Pair(newr,newc));
                    }
                }
            }
        }
        return distance[m-1][n-1];
    }
}
class Pair{
    int row,col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}