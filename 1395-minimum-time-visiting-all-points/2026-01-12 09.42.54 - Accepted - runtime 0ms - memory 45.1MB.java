class Solution {
    public int toTime(int[] from,int []to){
        int x=Math.abs(from[0]-to[0]);
        int y=Math.abs(from[1]-to[1]);
        return Math.max(x,y);
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int t=0;
        for(int i=1;i<points.length;i++){
            t+=toTime(points[i-1],points[i]);
        }
        return t;
    }
}