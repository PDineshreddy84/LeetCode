class Solution {
    public int smallestNumber(int n) {
        if(n==1){
            return 1;
        }
        int c=(int)(Math.ceil(Math.sqrt(n)));
        int res=(int)(Math.pow(2,c))-1;
        if(res<n){
            return (int)(Math.pow(2,c+1))-1;
        }
        return res;
    }
}