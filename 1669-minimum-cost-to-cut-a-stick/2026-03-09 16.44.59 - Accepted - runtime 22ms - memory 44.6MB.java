class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer>cutss=new ArrayList<>();
        cutss.add(0);
        cutss.add(n);
        int c=cuts.length;
        for(int i=0;i<c;i++){
            cutss.add(cuts[i]);
        }
        Collections.sort(cutss);
        int dp[][]=new int[c+2][c+2];
        for(int i=c;i>=1;i--){
            for(int j=i;j<=c;j++){
                 int min=Integer.MAX_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=cutss.get(j+1)-cutss.get(i-1)+dp[i][ind-1]+dp[ind+1][j];
                    min=Math.min(min,cost);
                }
                dp[i][j]=min;
            }
        }
        return dp[1][c];
    }
    int solve(int i,int j,List<Integer>cuts,int dp[][]){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int ind=i;ind<=j;ind++){
            int cost=cuts.get(j+1)-cuts.get(i-1)+solve(i,ind-1,cuts,dp)+solve(ind+1,j,cuts,dp);
            min=Math.min(min,cost);
        }
        return dp[i][j]=min;
    }
}