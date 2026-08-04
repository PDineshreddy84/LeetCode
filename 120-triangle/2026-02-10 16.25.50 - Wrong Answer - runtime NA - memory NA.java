class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[]=new int[n+1];
        dp[0]=triangle.get(0).get(0);
        int ind=0;
        for(int i=1;i<n;i++){
            int sum=dp[i-1];
            if(triangle.get(i).get(ind)>triangle.get(i).get(ind+1)){
                ind++;
            }
            int min=triangle.get(i).get(ind);
            if(ind+1<triangle.get(i).size()){
                min=Math.min(triangle.get(i).get(ind),triangle.get(i).get(ind+1));
            }
            dp[i]=sum+min;
        }
        return dp[n-1];
    }
}