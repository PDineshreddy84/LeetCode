class Solution {
    public String[] findRelativeRanks(int[] s) {
        int n=s.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(s[i],i);
        }
        Queue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:s){
            pq.add(ele);
        }
        String arr[]=new String[n];
        int rank=1;
        while(pq.size()!=0){
            int c=pq.remove();
            int in=m.get(c);
            if(rank==1){
                arr[in]="Gold Medal";
            }
            else if(rank==2){
                arr[in]="Silver Medal";
            }
            else if(rank==3){
                arr[in]="Bronze Medal";
            }
            else{
                arr[in]=rank+"";
            }
            rank++;
        }
        return arr;
    }
}