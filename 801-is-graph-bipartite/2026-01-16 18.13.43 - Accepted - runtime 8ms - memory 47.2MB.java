class Solution {
    int m;
    public boolean isBipartite(int[][] graph) {
        m=graph.length;
        int b[]=new int[m];
        Arrays.fill(b,-1);
        List<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<m;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            for(int ele:graph[i]){
                l.get(i).add(ele);
            }
        }
        for(int i=0;i<m;i++){
            if(b[i]==-1){
                if(bfs(l,i,b)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(List<List<Integer>>l,int i,int b[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        b[i]=0;
        while(!q.isEmpty()){
            int r=q.remove();
            for(int it:l.get(r)){
                if(b[it]==-1){
                    b[it]=1-b[r];
                    q.add(it);
                }
                else if(b[it]==b[r]){
                    return false;
                }
            }
        }
        return true;
    }
}