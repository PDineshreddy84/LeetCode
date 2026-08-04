class Solution {
    public int numberOfMatches(int n) {
        int m=0,s=0;
        if(n==1){
            return 0;
        }
       while(n>1){
            s+=n/2;
            if(n%2!=0 && (n/2)!=1){
                n++;
            }
            n/=2;
       }
        return s;
    }
}