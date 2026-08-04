class Solution {
    public boolean isValid(int row,int col,int n){
        if(row<0||row>=n||col<0||col>=n)return false;
        return true;
    }
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        Disjoint ds=new Disjoint(n*n);
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==0)continue;
                int dr[]={-1,0,1,0};
                int dc[]={0,-1,0,1};
                for(int ind=0;ind<4;ind++){
                    int newr=row+dr[ind];
                    int newc=col+dc[ind];
                    if(isValid(newr,newc,n) && grid[newr][newc]==1){
                        int nodeNo=row*n+col;
                        int adjNodeNo=newr*n+newc;
                        ds.unionBySize(nodeNo,adjNodeNo);
                    }
                }
            }
        }
        int max=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1)continue;
                int dr[]={-1,0,1,0};
                int dc[]={0,-1,0,1};
                Set<Integer>s=new HashSet<>();
                for(int ind=0;ind<4;ind++){
                    int newr=row+dr[ind];
                    int newc=col+dc[ind];
                    if(isValid(newr,newc,n) && grid[newr][newc]==1){
                        s.add(ds.findUlP(newr*n+newc));
                    }
                }
                int sizeT=0;
                for(Integer Parents:s){
                    sizeT+=ds.size.get(Parents);
                }
                max=Math.max(sizeT+1,max);
            }
        }
        for(int cellNo=0;cellNo<n*n;cellNo++){
            max=Math.max(max,ds.size.get(ds.findUlP(cellNo)));
        }
        return max;
    }
}
public class Disjoint{
    List<Integer>parent=new ArrayList<>();
    List<Integer>size=new ArrayList<>();
    public Disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findUlP(int node){
        if(node==parent.get(node))return node;
        int ulp=findUlP(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionBySize(int u,int v){
        int ulp_u=findUlP(u);
        int ulp_v=findUlP(v);
        if(ulp_u==ulp_v)return;
        if(size.get(u)<size.get(v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
        else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }
}