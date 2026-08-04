class Solution {
    public int countMonobit(int n) {
        if(n==0)return 1;
        if(n==1)return 2;
        int ans=0;
        ans=(int)Math.sqrt(n)+1;
        if((int)Math.pow(2,ans)-1==n){
            ans++;
        }
        return ans;
    }
}