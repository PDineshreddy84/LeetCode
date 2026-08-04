class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>l=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    l.get(i).add(j);
                    l.get(j).add(i);
                }
            }
        }
        int c=0;
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                c++;
                dfs(i,l,vis);
            }
        }
        return c;
    }
    public void dfs(int node,List<List<Integer>>l,int vis[]){
        vis[node]=1;
        for(Integer it:l.get(node)){
            if(vis[it]==0){
                vis[it]=1;
                dfs(it,l,vis);
            }
        }
    }
}