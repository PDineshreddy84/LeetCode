class Solution {
    public long maxPairStrength(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int cal=gcd(nums[i],nums[i+1]);
            max=Math.max(max,((nums[i]*nums[i+1])/(cal*cal)));
        }
        return max;
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}