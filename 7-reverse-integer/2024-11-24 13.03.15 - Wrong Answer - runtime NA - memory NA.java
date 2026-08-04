class Solution {
    public int reverse(int x) {
        int r=0,rem=0;
        if((x<Math.pow(-2,31))&&x>(Math.pow(2,31)-1))
        return 0;
        while(x!=0){
            rem=x%10;
            r=r*10+rem;
            x=x/10;
        }
        return r;

    }
}