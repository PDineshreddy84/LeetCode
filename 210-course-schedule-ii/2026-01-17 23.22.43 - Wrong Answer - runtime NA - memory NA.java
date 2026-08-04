class Solution {
    public int[] findOrder(int v, int[][] prerequisites) {
        List<List<Integer>>l=new ArrayList<>();
        int n=prerequisites.length;
        for(int i=0;i<v;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            l.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int indegree[]=new int[v];
        for(int i=0;i<v;i++){
            for(int node:l.get(i)){
                indegree[node]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int t[]=new int[v];
        int k=v-1;
        while(!q.isEmpty()){
            int rem=q.remove();
            t[k--]=rem;
            for(int node:l.get(rem)){
                indegree[node]--;
                if(indegree[node]==0){
                    q.add(node);
                }
            }
        }
      return t;
    }
}