class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int l=1,h=0;
        for(int ele:nums){
            h=Math.max(ele,h);
        }
        int ans=-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(isPossible(nums,m,t)){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean isPossible(int nums[],int m,int t){
        int s=0;
        for(int ele:nums){
            s+=(int)(Math.ceil((double)ele/m));
        }
        return s<=t;
    }
}