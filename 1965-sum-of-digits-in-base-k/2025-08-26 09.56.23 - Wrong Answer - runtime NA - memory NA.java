class Solution {
    public int sumBase(int n, int k) {
        int sum=0,s=0;
        while(n>=k){
            sum+=n/k;
            n=n%k;
        }
        sum+=n;
        while(sum!=0){
            s+=sum%10;
            sum/=10;
        }
        
        return s;
    }
}