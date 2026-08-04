class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>>l=new ArrayList<>();
        int m=flights.length;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            l.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Queue<Tuple>q=new LinkedList<>();
        q.add(new Tuple(0,src,0));
        dist[src]=0;
        while(!q.isEmpty()){
            Tuple it=q.remove();
            int stops=it.stops;
            int node=it.node;
            int cost=it.weight;
            if(stops>k)continue;
            for(Pair iter:l.get(node)){
                int adjNode=iter.node;
                int edW=iter.weight;
                if(cost+edW<dist[adjNode] && stops<=k){
                    dist[adjNode]=cost+edW;
                    q.add(new Tuple(stops+1,adjNode,cost+edW));
                }
            }
        }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];
    }    
}
class Pair{
    int node,weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}
class Tuple{
    int stops,node,weight;
    Tuple(int stops,int node,int weight){
        this.stops=stops;
        this.node=node;
        this.weight=weight;
    }
}