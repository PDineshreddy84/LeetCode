class Solution {
    public boolean isPowerOfThree(int n) {
        int p=(int)(Math.log(n)/Math.log(3));
        if(n==0||n==2){
            return false;
        }
        else if(n==1){
            return true;
        }
        else if(n%3==0 && n==(int)(Math.pow(3,p))){
                return true;
        }
        else{
            return false;
        }
        
    }
}