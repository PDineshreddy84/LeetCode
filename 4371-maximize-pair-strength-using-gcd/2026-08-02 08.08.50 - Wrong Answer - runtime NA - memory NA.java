class Solution {
    public long maxPairStrength(int[] nums) {
        int max=0;
        int n=nums.length;
        Arrays.sort(nums);
        int cal=gcd(nums[n-1],nums[n-2]);
        return ((nums[n-1]*nums[n-2])/(cal*cal));
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}