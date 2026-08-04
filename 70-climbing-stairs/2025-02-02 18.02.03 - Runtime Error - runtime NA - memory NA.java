class Solution {
    public int climbStairs(int n) {
        int a=1,b=2;
       if(n==1){
        return a;
       }
        else if(n==2){
            return b;
        }
      else if(n==3){
            return a+b;
        }
        else
        return climbStairs(n)+climbStairs(n-1);
       }    
}