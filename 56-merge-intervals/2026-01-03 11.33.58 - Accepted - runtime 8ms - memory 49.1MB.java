class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        int i=0;
        while(i<n){
            int s=intervals[i][0];
            int e=intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=e){
                e=Math.max(e,intervals[j][1]);
                j++;
            }
            l.add(Arrays.asList(s,e));
            i=j;
        }
        int len=l.size();
        int res[][]=new int[len][2];
        for(i=0;i<len;i++){
            res[i][0]=l.get(i).get(0);
            res[i][1]=l.get(i).get(1);
        }
        return res;
    }
}