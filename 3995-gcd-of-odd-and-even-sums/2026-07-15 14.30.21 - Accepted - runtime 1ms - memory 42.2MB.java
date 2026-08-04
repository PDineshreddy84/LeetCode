class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*(n+1),n*n);
    }
    int gcd(int a,int b){
        if(a==0)return b;
        if(b==0)return a;
        if(a<b){
            return gcd(a,b%a);
        }
        else{
            return gcd(a%b,b);
        }
    }
}