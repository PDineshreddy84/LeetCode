class Solution {
    public double largestTriangleArea(int[][] points) {
        int h=-51,b=-51;
        for(int j=0;j<2;j++){
            for(int i=0;i<points.length;i++){
                if(j==0 && points[i][j]>b){
                    b=points[i][j];
                }
                else if(j==1 && points[i][j]>h){
                    h=points[i][j];
                }
            }
        }
        return (double)(0.5*b*h);
    }
}