class Solution {
    public int reverse(int x) {
        int r=0,rem=0;
        while(x!=0){
            rem=x%10;
            r=r*10+rem;
            x=x/10;
        }
        if(r>Integer.MAX_VALUE/10||r<Integer.MIN_VALUE/10)
        return 0;
        return r;

    }
}