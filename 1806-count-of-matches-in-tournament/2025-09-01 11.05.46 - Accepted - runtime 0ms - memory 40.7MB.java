class Solution {
    public int numberOfMatches(int n) {
        int t=0;
        while(n>1){
            t+=n/2;
            if(n%2==0){
                n/=2;
            }
            else{
                n/=2;
                n++;
            }
        }
        return t;
    }
}