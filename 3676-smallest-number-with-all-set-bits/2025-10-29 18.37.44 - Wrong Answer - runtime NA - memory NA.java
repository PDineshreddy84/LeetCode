class Solution {
    public int smallestNumber(int n) {
        
        int c=(int)(Math.ceil(Math.sqrt(n)));
        return (int)(Math.pow(2,c))-1;
    }
}