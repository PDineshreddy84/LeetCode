class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int m=graph.length;
         List<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<m;i++){
            l.add(new ArrayList<>());
        }
          for(int i=0;i<m;i++){
            for(int node:graph[i]){
                l.get(node).add(i);
            }
        }
        int indegree[]=new int[m];
        for(int i=0;i<m;i++){
            for(int node:l.get(i)){
                indegree[node]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(indegree[i]==0)q.add(i);
        }
        List<Integer>res=new ArrayList<>();
        while(!q.isEmpty()){
            int rem=q.remove();
            res.add(rem);
            for(int it:l.get(rem)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(res);
        return res;
        // m=graph.length;
        // List<List<Integer>>l=new ArrayList<>();
        // for(int i=0;i<m;i++){
        //     l.add(new ArrayList<>());
        // }
        // for(int i=0;i<m;i++){
        //     for(int node:graph[i]){
        //         l.get(i).add(node);
        //     }
        // }
        // int vis[]=new int[m];
        // int pathvis[]=new int[m];
        // for(int i=0;i<m;i++){
        //     if(vis[i]==0){
        //         dfs(l,vis,pathvis,i);
        //     }
        // }
        // List<Integer>ans=new ArrayList<>();
        // for(int i=0;i<m;i++){
        //     if(pathvis[i]==0){
        //         ans.add(i);
        //     }
        // }
        // return ans;
    }
//     public boolean dfs(List<List<Integer>>l,int vis[],int pathvis[],int i){
//         vis[i]=1;
//         pathvis[i]=1;
//         for(int node:l.get(i)){
//             if(vis[node]==0){
//                  if(dfs(l,vis,pathvis,node)==true){
//                     return true;
//                  }
//             }
//             else if(pathvis[node]==1){
//                 return true;
//             }
//         }
//         pathvis[i]=0;
//         return false;
//     }
}