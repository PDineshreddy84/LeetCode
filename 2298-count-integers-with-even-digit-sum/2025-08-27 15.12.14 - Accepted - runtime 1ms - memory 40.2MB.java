class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(count(i)){
                c++;
            }
        }
        return c;
    }
    public boolean count(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum%2==0;
    }
}