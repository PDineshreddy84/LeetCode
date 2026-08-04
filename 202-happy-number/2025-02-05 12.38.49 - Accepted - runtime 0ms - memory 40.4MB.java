class Solution {
    public boolean isHappy(int n) {
      while(n>=10){
        n=square(n);
      }
      if(n==1||n==7){
        return true;
      }
      return false;
    }
         public static int square(int n){
        int temp=0,sum=0;
          while(n!=0){
                temp=n%10;
                temp=temp*temp;
                sum+=temp;
                n=n/10;
            }
            return sum;
         }
}