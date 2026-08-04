class Solution {
    public int countTriples(int n) {
        int  c=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int x=(int)Math.sqrt(i*i+j*j);
                if(x<=n && i*i+j*j==x*x){
                    c++;
                }
            }
        }
        return 2*c;
    }
}