class Solution {
    public int smallestNumber(int n) {
        if(n==1){
            return 1;
        }
        int c=(int)(Math.floor(Math.sqrt(n)));
        return (int)(Math.pow(2,c+1))-1;
    }
}