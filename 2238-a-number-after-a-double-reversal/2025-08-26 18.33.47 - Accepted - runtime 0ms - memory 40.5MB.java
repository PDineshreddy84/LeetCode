class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0,r=0;
        int n=num;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        while(rev!=0){
            int rem=rev%10;
            r=r*10+rem;
            rev/=10;
        }
        return n==r;
    }
}