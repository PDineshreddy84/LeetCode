class Solution {
    public int reverse(int x) {
        int r=0,rem=0;
        while(x!=0){
            rem=x%10;
            r=r*10+rem;
            x=x/10;
        }
        if((r<Math.pow(-2,31))||r>(Math.pow(2,31)-1))
        return 0;
        else
        return r;

    }
}