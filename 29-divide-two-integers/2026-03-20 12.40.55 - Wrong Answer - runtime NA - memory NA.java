class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        boolean sign=true;
        if((dividend<0 && divisor>0)||(dividend>0 && divisor<0)){
            sign=false;
        }
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int ans=0;
        while(dividend>=divisor){
            int c=0;
            while(dividend>=((divisor)*(1<<c))){
                c++;
            }
            c--;
            ans+=(1<<c);
            dividend-=(divisor*(1<<c));
        }
        if(dividend>=Integer.MAX_VALUE){
            return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return sign?ans:-ans;
    }
}