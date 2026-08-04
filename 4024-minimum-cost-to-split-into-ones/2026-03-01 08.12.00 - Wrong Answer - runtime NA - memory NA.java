class Solution {
    public int minCost(int n) {
        int c=0;
        int r=n;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                c+=n*n;
            }
            else{
                n=n-1;
                c+=n*(n-1);
            }
        }
        if(r%2==0)c++;
        return c;
    }
}