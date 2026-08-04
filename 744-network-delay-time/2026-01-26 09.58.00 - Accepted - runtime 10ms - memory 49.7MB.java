class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>>l=new ArrayList<>();
        for(int i=0;i<=n;i++){
            l.add(new ArrayList<>());
        }
        int m=times.length;
        for(int i=0;i<m;i++){
            l.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(k,0));
        while(!q.isEmpty()){
            Pair it=q.remove();
           int node=it.node;
           int time=it.time;
           for(Pair iter:l.get(node)){
                int adjNode=iter.node;
                int t=iter.time;
                if(time+t<dist[adjNode]){
                    dist[adjNode]=time+t;
                    q.add(new Pair(adjNode,time+t));
                }
           }
        }
        int maxTime=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE){
                return -1;
            }
            maxTime=Math.max(maxTime,dist[i]);
        }
     return maxTime;
    }
}
class Pair{
    int node,time;
    Pair(int node,int time){
        this.node=node;
        this.time=time;
    }
}