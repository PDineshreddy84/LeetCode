class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length,max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==j || i==n-j-1 ) && isPrime(nums[i][j])){
                    int ele=nums[i][j];
                    if(max<ele){
                        max=ele;
                    }
                }
            }
        }
        return max;
    }
    public boolean isPrime(int n){
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