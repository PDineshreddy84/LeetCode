class Solution {
    public int countEven(int num) {
        if(num<10){
            return num/2;
        }
        int rem=num%10;
        num-=rem;
        int res=(num/2)+(rem/2)-1;
        return res;
    }
}