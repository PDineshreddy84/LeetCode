class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        Arrays.sort(cost);
        int t=0;
        int c=0;
        for(int i=n-1;i>=0;i--){
            c++;
            if(c%3==0){
                continue;
            }
            t+=cost[i];
        }
        return t;
    }
}