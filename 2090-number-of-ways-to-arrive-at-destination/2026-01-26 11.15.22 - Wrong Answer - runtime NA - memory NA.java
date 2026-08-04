class Solution {
    public int countPaths(int n, int[][] roads) {
        int m=roads.length;
        List<List<Pair>>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            l.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            l.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));
        }
        int ways[]=new int[n];
        ways[0]=1;
        int dist[]=new int[n];
        Arrays.fill(dist,(int)(1e9+7));
        dist[0]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->x.time-y.time);
        pq.add(new Pair(0,0));
        int mod=(int)(1e9+7);
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int node=p.node;
            int time=p.time;
            for(Pair it:l.get(node)){
                int t=it.time;
                int adjNode=it.node;
                if(time+t<dist[adjNode]){
                    dist[adjNode]=time+t;
                    pq.add(new Pair(adjNode,time+t));
                    ways[adjNode]=ways[node];
                }
                else if(time+t==dist[adjNode]){
                    ways[adjNode]=(ways[node]+ways[adjNode])%mod;
                }
            }
        }
        return ways[n-1]%mod;
    }
}
class Pair{
    int node,time;
    Pair(int node ,int time){
        this.node=node;
        this.time=time;
    }
}