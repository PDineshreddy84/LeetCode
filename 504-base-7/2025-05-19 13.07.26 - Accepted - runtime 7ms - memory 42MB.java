class Solution {
    public String convertToBase7(int n) {
       if(n<0){
        return '-'+convertToBase7(-n);
       } 
       if(n<7){
        return n+"";
       }
       return convertToBase7(n/7)+n%7;
    }
}