class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,r=46340;
        while(l<=r){
            int m=(l+r)/2;
            if(m*m==num){
                return true;
            }
            else if(m*m>num){
                r=m-1;
            }
            else{
                l=m+1;
            }
           
        }
        return false;
    }
    }