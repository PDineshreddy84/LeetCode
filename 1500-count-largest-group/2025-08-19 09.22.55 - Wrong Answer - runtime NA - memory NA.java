class Solution {
    public int countLargestGroup(int n) {
        int num=n,sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum;
    }
}