class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        List<Pair>l=new ArrayList<>();
        for(int i=0;i<capacity.length;i++){
            l.add(new Pair(capacity[i],costs[i]));
        }
        l.sort((a,b)->b.cap-a.cap);
        int c=0,cc=0;
        for(Pair p:l){
            if(c+p.cost<budget){
                cc+=p.cap;
                c+=p.cost;
            }
        }
        return cc;
    }
}
class Pair{
    int cap,cost;
    Pair(int cap,int cost){
        this.cap=cap;
        this.cost=cost;
    }
}