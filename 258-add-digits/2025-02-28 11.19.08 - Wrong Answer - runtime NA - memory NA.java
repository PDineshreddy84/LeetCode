class Solution {
    public int addDigits(int num) {
        int temp=num,sum=0;
        while(temp>10){
           sum=add(temp);
           temp=sum;
        }
        return temp;
    }
    public static int add(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}