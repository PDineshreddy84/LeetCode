class Solution {
    public int countLargestGroup(int n) {
        int num=n,sum=0;
       if(num<10){
        return n;
       }
       else{
        return (num%10)+1;
       }
    }
}