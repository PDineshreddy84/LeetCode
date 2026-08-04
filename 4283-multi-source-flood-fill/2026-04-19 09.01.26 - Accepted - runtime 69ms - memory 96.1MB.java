class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int mat[][]=new int[n][m];
        int len=sources.length;
        Arrays.sort(sources,(a,b)->b[2]-a[2]);
        Queue<Triplet>q=new LinkedList<>();
        for(int i=0;i<len;i++){
            mat[sources[i][0]][sources[i][1]]=sources[i][2];
            q.add(new Triplet(sources[i][2],sources[i][0],sources[i][1]));
        }
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                Triplet t=q.remove();
                int val=t.val;
                int i=t.i;
                int j=t.j;
                if(i+1<n && j<m && mat[i+1][j]==0){
                    mat[i+1][j]=val;
                    q.add(new Triplet(val,i+1,j));
                }
                if(i-1>=0 && j>=0 && mat[i-1][j]==0){
                    mat[i-1][j]=val;
                    q.add(new Triplet(val,i-1,j));
                }
                if(i<n && j+1<m && mat[i][j+1]==0){
                    mat[i][j+1]=val;
                    q.add(new Triplet(val,i,j+1));
                }
                if(i<n && j-1>=0 && mat[i][j-1]==0){
                    mat[i][j-1]=val;
                    q.add(new Triplet(val,i,j-1));
                }
            }
        }
        return mat;
    }
}
class Triplet{
    int val,i,j;
    Triplet(int val,int i,int j){
        this.val=val;
        this.i=i;
        this.j=j;
    }
}