class Solution {
    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>>l=new ArrayList<>();
        int m=(int)(1e9)+7;
        int n=edges.length+2;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int edg[]:edges){
            int u=edg[0];
            int v=edg[1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        int d=getMaxDepth(1,-1,l);
        return (int)Math.pow(2,d-1)%m;
    }
    public int getMaxDepth(int node,int parent,List<List<Integer>>l){
        int depth=0;
        for(int neigh:l.get(node)){
            if(neigh==parent)continue;
            depth=Math.max(depth,getMaxDepth(neigh,node,l)+1);
        }
        return depth;
    }
}
