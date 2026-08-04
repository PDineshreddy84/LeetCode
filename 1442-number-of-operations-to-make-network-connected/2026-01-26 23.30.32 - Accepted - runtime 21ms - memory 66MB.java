class Solution {
    public int makeConnected(int n, int[][] connections) {
        Disjoint ds=new Disjoint(n);
        int ce=0;
        int m=connections.length;
        for(int i=0;i<m;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            if(ds.findUlP(u)==ds.findUlP(v)){
                ce++;
            }
            else{
                ds.unionBySize(u,v);
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(ds.parent.get(i)==i)c++;
        }
        int ans=c-1;
        if(ce>=ans)return ans;
        return -1;
    }
}
public class Disjoint{
    List<Integer>rank=new ArrayList<>();
    List<Integer>parent=new ArrayList<>();
    List<Integer>size=new ArrayList<>();
    public Disjoint(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            size.add(1);
            parent.add(i);
        }
    }
    public int findUlP(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUlP(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionByRank(int u,int v){
        int ulp_u=findUlP(u);
        int ulp_v=findUlP(v);
        if(ulp_u==ulp_v)return;
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_v)<rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }
        else{
            parent.set(ulp_v,ulp_u);
            int rankU=rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }
    public void unionBySize(int u,int v){
        int ulp_u=findUlP(u);
        int ulp_v=findUlP(v);
        if(ulp_u==ulp_v)return;
        if(size.get(u)<size.get(v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(u)+size.get(v));
        }
        else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(u)+size.get(v));
        }
    }
}