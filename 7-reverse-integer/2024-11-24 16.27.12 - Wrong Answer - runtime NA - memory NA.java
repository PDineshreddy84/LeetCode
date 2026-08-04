class Solution {
    public int reverse(int x) {
        int r=0,rem=0;
        while(x!=0){
            rem=x%10;
            x=x/10;
        if(r>=((Integer.MAX_VALUE)/10)||r<=((Integer.MIN_VALUE)/10)&&(x>7||x<-8))
        return 0;
            r=r*10+rem;
        }
        return r;

    }
}