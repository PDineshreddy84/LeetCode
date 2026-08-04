class Solution {
    public int totalMoney(int n) {
        int c=1,t=0;
        while(n>=7){
            t+=clac(6+c,c);
            n-=7;
            c++;
        }
       t+=clac(c+n-1,c);
        return t;
    }
    public int clac(int n,int c){
        return ((n*(n+1))/2)-((c*(c-1))/2);
    }
}