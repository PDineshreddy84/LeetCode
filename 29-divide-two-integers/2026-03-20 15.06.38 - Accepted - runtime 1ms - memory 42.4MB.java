class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        boolean sign=true;
        if((dividend<=0 && divisor>0)||(dividend>=0 && divisor<0)){
            sign=false;
        }
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d){
            int c=0;
            while(n>=(d<<(c+1))){
                c++;
            }
            ans+=(1<<c);
            n-=(d<<c);
        }
        if(ans==(1<<31)){
            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return sign?(int)ans:-(int)ans;
    }
}