class Solution {
    public boolean canIWin(int m, int d) {
       if(d<=m){
        return true;
       }
        int div=d/m;
        if(div%2==0){
            return false;
        }
        return true;
    }
}