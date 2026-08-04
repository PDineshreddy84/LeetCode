class Solution {
    public double myPow(double x, int n) {
        if(n<0)return 1.0/helper(x,-n);
        return helper(x,n);
    }
    public double helper(double x,int n){
        if(n==0)return 1;
        double half=helper(x,n>>1);
        if((n&1)==0)return half*half;
        return half*half*x;
    }
}