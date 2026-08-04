class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(String a,String b)->a.length()-b.length());
        int n=words.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[i],words[j]) && dp[i]<1+dp[j]){
                    dp[i]=1+dp[j];
                }
            }
            if(dp[i]>maxLen){
                maxLen=dp[i];
            }
        }
        return maxLen;
    }
    boolean check(String a,String b){
        if(a.length()!=b.length()+1)return false;
        int f=0,s=0;
        while(f<a.length()){
            if(s<b.length() && a.charAt(f)==b.charAt(s)){
                f++;
                s++;
            }
            else{
                f++;
            }
        }
        if(f==a.length() && s==b.length())return true;
        return false;
    }
}