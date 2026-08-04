class Solution {
    public boolean isPowerOfThree(int n) {
        int p=(int)(Math.round(Math.log(n)/Math.log(3)));
        int res=(int)(Math.round(Math.pow(3,p)));
        System.out.println(res+" "+p);
        if(n==0||n==2){
            return false;
        }
        else if(n==1){
            return true;
        }
        else if(n%3==0 && n==res){
                return true;
        }
        else{
            return false;
        }
    }
}