class Solution {
    public boolean isPowerOfThree(int n) {
        return n==1?true:(n==0)||(n%3!=0)?false:isPowerOfThree(n/3);
    }
}