class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       Map<Integer,List<Integer>>g=new HashMap<>();
       if(n==1 || source==destination){
        return true;
       }
        for(int i=0;i<n;i++){
            g.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        return bfs(g,source,destination);
    }
    static  boolean bfs(Map<Integer,List<Integer>>g,int s,int d){
        Queue<Integer>q=new LinkedList<>();
        Set<Integer>vis=new HashSet<>();
        q.add(s);
        vis.add(s);
        while(!q.isEmpty()){
            int u=q.remove();
            for(int l:g.get(u)){
                if(!vis.contains(l)){
                    q.add(l);
                    if(l==d){
                        return true;
                    }
                    vis.add(l);
                }
            }
        }
        return false;
    }
}