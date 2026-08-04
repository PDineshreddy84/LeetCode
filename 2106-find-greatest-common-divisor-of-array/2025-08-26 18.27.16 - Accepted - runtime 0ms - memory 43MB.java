class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length,s=nums[0],m=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<s){
                s=nums[i];
            }
            if(nums[i]>m){
                m=nums[i];
            }
        }
        return gcd(s,m);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}