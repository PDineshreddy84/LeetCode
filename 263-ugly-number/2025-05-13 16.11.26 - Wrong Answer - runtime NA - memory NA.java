class Solution {
    public boolean isUgly(int n) {
       for(int i=2;i<=n/2;i++){
            if(!(isPrime(i) && (n%2==0||n%3==0||n%5==0) && i<=5)){
                return false;
            }
       }
       return true;
    }
    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}