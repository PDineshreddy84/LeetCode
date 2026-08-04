class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int sqr=(int)(Math.log(n)/Math.log(2));
        if(n%2==0 && n==(int)(Math.pow(2,sqr))){
           return true;
        }
        return false;
    }
}