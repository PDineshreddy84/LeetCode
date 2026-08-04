class Solution {
    public int arrangeCoins(int n) {
       long l=1,h=n,m;
       while(l<=h){
        m=(l+h)/2;
        if(m*(m+1)/2<=n){
            l=m+1;
        }else{
            h=m-1;
        }
       }
       return (int)h;
    }
}