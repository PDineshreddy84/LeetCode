class Solution {
    public int reverse(int x) {
        long r=0,rem=0;
        while(x!=0){
            rem=x%10;
            x=x/10;
            r=r*10+rem;
        }
        return (r>Integer.MAX_VALUE||r<Integer.MIN_VALUE)?0:(int)r;

    }
}