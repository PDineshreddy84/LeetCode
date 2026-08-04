class Solution {
    public String convertToBase7(int num) {
        int r,s=0;
        int n=num;
        if(num<0){
            num*=-1;
        }
        while(num!=0){
            r=num%7;
            s=r+s*10;
            num/=7;
        }
        if(n<0){
            s*=-1;
        }
        if(n%7==0){
            s*=10;
        }
        return Integer.toString(s);
    }
}