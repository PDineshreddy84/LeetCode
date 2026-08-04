class Solution {
    public int mySqrt(int x) {
        int result=0;
        for(int i=1;i<=x;i++){
            if(i*i<=x){
                    result=i;
            }
           else if(i*i>x){
                break;
            }
        }
        return result;
    }
}