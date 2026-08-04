class Solution {
    public int countEven(int num) {
        int n=num;
        if(num<10){
            return num/2;
        }
        int rem=num%10;
        num-=rem;
        if(n%2!=0||(n%10==0 && (n/2)%2==0)){        
                 return (num/2)+(rem/2);
        }
        return (num/2)+(rem/2)-1;
    }
}