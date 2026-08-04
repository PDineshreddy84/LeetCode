class Solution {
    public boolean canAliceWin(int n) {
        int rem=n%10;
        n/=10;
        if((n==1||n==3||n==5)&& (rem!=9)){
            return true;
        }
        return false;
    }
}