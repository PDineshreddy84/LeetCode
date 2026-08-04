class Solution {
    public boolean canAliceWin(int n) {
      int s=10;
      boolean t=false;
      while(n>=s){
        n-=s;
        s--;
        t=!t;
      }
      return t;
    }
}