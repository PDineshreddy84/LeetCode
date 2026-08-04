class Solution {
    public boolean canWinNim(int n) {
        if(n<3){
            return true;
        }
        if(n%3==0){
            return true;
        }
        else
            return false;
    }
}