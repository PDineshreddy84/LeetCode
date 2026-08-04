class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int pref[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            pref[i]=gcd(nums[i],mx);
        }
        Arrays.sort(pref);
        int l=0,r=n-1;
        long sum=0;
        while(l<r){
            sum+=gcd(pref[l],pref[r]);
            l++;r--;
        }
        return sum;
    }
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}