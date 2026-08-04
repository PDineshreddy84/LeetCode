class Solution {
    public int arrangeCoins(int n) {
        if(n<3){
            return 1;
        }else if(n<6){
            return 2;
        }
        else
            return n-(n/2)-1; 
    }
}