class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n=costs.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(costs[i],capacity[i]);
        }
        Arrays.sort(arr,(a,b)->(a.cost-b.cost));
        int l=0,r=n-1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i].cost<budget){
                ans=Math.max(ans,arr[i].cap);
            }
        }
        while(l<r){
            int s=arr[l].cost+arr[r].cost;
            if(s<budget){
                ans=Math.max(ans,(arr[l].cap+arr[r].cap));
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}
class Pair{
    int cost,cap;
    Pair(int cost,int cap){
        this.cost=cost;
        this.cap=cap;
    }
}