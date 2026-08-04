class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length,p=0,s=0;
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                p+=nums[i];
            }
            else{
                s+=nums[i];
            }   
        }
        return Math.abs(p-s);
    }
    public static Boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}