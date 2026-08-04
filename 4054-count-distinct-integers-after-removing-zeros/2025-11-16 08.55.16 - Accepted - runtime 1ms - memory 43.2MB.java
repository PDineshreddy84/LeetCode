class Solution {
    public long countDistinct(long n) {
        String s=Long.toString(n);
        int L=s.length();
        long pow9[]=new long[L+1];
        pow9[0]=1;
        for(int i=1;i<=L;i++){
            pow9[i]=pow9[i-1]*9l;
        }
        long res=0;
        for(int len=1;len<L;len++){
            res+=pow9[len];
        }
        for(int i=0;i<L;i++){
            int d=s.charAt(i)-'0';
            if(d==0){
                return res;
            }
            int c=d-1;
            int rem=L-i-1;
            res+=(long)c*pow9[rem];
        }
        return res+1;
    }
}