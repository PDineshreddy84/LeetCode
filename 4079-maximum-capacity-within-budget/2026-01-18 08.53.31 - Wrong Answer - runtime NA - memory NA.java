class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {
        int n=costs.length;
        machine arr[]=new machine[n];
        for(int i=0;i<n;i++){
            arr[i]=new machine(costs[i],capacity[i]);
        }
        Arrays.sort(arr,(a,b)->a.cost-b.cost);
        int ans=0;
        for(machine m:arr){
            if(m.cost<budget){
                ans=Math.max(ans,m.cap);
            }
        }
        int pref[]=new int[n];
        pref[0]=arr[0].cap;
        for(int i=1;i<n;i++){
            pref[i]=Math.max(pref[i-1],arr[i].cap);
        }
        int l=0,r=n-1;
        while(l<r){
            int sc=arr[l].cost+arr[r].cost;
            if(sc<budget){
                ans=Math.max(ans,arr[r].cap+pref[l]);
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}
class machine{
    int cost,cap;
    machine(int cost,int cap){
        this.cost=cost;
        this.cap=cap;
    }
}