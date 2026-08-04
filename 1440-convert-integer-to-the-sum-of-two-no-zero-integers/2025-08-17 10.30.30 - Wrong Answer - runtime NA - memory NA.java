class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i*i<=n;i++){
            if(i%10!=0 && (n-i)%10!=0){
                return new int[]{i,n-i};
            }
        }
        return new int[]{n-1,1};
    }
}