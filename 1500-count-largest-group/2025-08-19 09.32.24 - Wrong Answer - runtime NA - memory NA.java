class Solution {
    public int countLargestGroup(int n) {
        int num=n,sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
       if(num<10){
        return num;
       }
       else if(sum%10!=0){
        return (num%10)+1;
       }
       else{
        return num%10;
       }
    }
}