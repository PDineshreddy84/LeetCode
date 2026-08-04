class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[]=new int[n+1];
        dp[n-1]=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<triangle.get(n-1).size();i++){
            if(dp[n-1]>triangle.get(n-1).get(i)){
                dp[n-1]=triangle.get(n-1).get(i);
                ind=i;
            }
        }
        for(int i=n-2;i>=0;i--){
            int sum=dp[i+1];
            if(ind==0){
                dp[i]=sum+triangle.get(i).get(0);
                continue;
            }
            if(ind==triangle.get(i).size()){
                dp[i]=sum+triangle.get(i).get(ind-1);
                ind--;
                continue;
            }
            if(triangle.get(i).get(ind)<triangle.get(i).get(ind-1)){
                dp[i]=sum+triangle.get(i).get(ind);
            }
            else{
                dp[i]=sum+triangle.get(i).get(ind-1);
                ind--;
            }
        }
        return dp[0];
    }
}