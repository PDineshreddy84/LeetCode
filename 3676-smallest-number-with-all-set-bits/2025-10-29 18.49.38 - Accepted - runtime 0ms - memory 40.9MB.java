class Solution {
    public int smallestNumber(int n) {
        int i=0;
        for(i=0;i<n;i++){
            if(Math.pow(2,i)>n){
                break;
            }
        }
        int res=(int)Math.pow(2,i)-1;
        return res;
    }
}