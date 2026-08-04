class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int distance[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(distance[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Tuple>q=new PriorityQueue<Tuple>((x,y)->x.diff-y.diff);
        q.add(new Tuple(0,0,0));
        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};
        while(!q.isEmpty()){
            Tuple it=q.remove();
            int row=it.row;
            int col=it.col;
            int diff=it.diff;
            if(row==m-1 && col==n-1)return diff;
            for(int i=0;i<4;i++){
                int newr=dr[i]+row;
                int newc=dc[i]+col;
                if(newr>=0 && newc>=0 && newr<m && newc<n){
                    int absDiff=Math.max(Math.abs(heights[newr][newc]-heights[row][col]),diff);
                    if(absDiff<distance[newr][newc]){
                        distance[newr][newc]=absDiff;
                        q.add(new Tuple(absDiff,newr,newc));
                    }
                }
            }
        }
        return 0;
    }
}
class Tuple{
    int diff,row,col;
    Tuple(int diff,int row,int col){
        this.diff=diff;
        this.row=row;
        this.col=col;
    }
}