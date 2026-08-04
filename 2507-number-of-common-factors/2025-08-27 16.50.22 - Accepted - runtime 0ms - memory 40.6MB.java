class Solution {
    public int commonFactors(int a, int b) {
        int c=0;
        int n=Math.max(a,b);
        for(int i=1;i<=n/2;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        if(a==b){
            c++;
        }
        return c;
    }
}