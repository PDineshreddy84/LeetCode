class Solution {
    public boolean isUgly(int n) {
        int ele;
       for(int i=2;i<=n/2;i++){
            if(isPrime(i)){
                ele=i;
            if(n%ele==0 && ele!=2 &&ele !=3 && ele!=5){
                return false;
            }
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