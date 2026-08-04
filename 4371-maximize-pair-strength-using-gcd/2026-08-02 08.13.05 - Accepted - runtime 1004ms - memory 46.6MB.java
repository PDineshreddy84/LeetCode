class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long cal=gcd(nums[i],nums[j]);
                max=Math.max(max,(((long)nums[i]*nums[j])/(cal*cal)));
            }
        }
        return max;
    }
    long gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}