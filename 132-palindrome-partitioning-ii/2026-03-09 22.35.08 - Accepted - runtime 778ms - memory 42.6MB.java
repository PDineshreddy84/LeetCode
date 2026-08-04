class Solution {
    public int minCut(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(isPalindrome(ch,i,j)){
                    int cost=1+dp[j+1];
                    min=Math.min(min,cost);
                }
            }
            dp[i]=min;
        }
        return dp[0]-1;
    }
    int solve(char ch[],int i,int n,int dp[]){
        if(i==n)return 0;
        if(dp[i]!=-1)return dp[i];
        int min=Integer.MAX_VALUE;
        for(int j=i;j<n;j++){
            if(isPalindrome(ch,i,j)){
                int cost=1+solve(ch,j+1,n,dp);
                min=Math.min(min,cost);
            }
        }
        return dp[i]=min;
    }
    boolean isPalindrome(char ch[],int i,int j){
        while(i<j){
            if(ch[i]!=ch[j])return false;
            i++;
            j--;
        }
        return true;
    }
}