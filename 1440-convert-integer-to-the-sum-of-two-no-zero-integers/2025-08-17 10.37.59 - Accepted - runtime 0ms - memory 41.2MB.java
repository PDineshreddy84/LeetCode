class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(nz(n-i)&&nz(i)){
                return new int[]{n-i,i};
            }
        }
        return new int[]{};
    }
    public boolean nz(int n){
        while(n!=0){
            if(n%10==0)return false;
            n/=10;
        }
        return true;
    }
}