class Solution {
    public int smallestNumber(int n) {
        int c=(int)(Math.floor(Math.sqrt(n)));
        return (int)(Math.pow(2,c+1))-1;
    }
}