class Solution {
    public int numberOfMatches(int n) {
        int m=0,s=0;
        while(m!=1){
            m=(n/2);
            s+=m;
            if(n%2!=0){
                n=m+1;
            }
            else{
                n=m;
            }
        }
        return s;
    }
}