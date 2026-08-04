class Solution {
    int m;
    int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m=image.length;
        n=image[0].length;
        int req=image[sr][sc];
        if(req==color){
            return image;
        }
        dfs(image,sr,sc,color,req);
        return image;
    }
    public void dfs(int image[][],int sr,int sc,int color,int req){
        if(sr<0 || sr>=m || sc<0 || sc>=n || image[sr][sc]!=req)return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,color,req);
        dfs(image,sr-1,sc,color,req);
        dfs(image,sr,sc+1,color,req);
        dfs(image,sr,sc-1,color,req);
    }
}