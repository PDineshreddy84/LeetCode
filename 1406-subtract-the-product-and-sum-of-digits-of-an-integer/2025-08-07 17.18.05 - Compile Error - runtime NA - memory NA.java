class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0,r=0;
        while(n!=0){
            r=num%10;
            s+=r;
            p*=r;
            num/=10;
        }
        return Math.abs(p-s);
    }
}