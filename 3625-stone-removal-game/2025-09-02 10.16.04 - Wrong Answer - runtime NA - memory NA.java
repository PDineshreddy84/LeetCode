class Solution {
    public boolean canAliceWin(int n) {
        n/=10;
        if(n==1||n==3||n==5){
            return true;
        }
        return false;
    }
}