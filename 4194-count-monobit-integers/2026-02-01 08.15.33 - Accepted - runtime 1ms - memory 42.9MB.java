class Solution {
    public int countMonobit(int n) {
        if(n==0)return 1;
        if(n==1)return 2;
        int bits=32-Integer.numberOfLeadingZeros(n);
      if((n&(n+1))==0){
          return bits+1;
      }
        return bits;
    }
}