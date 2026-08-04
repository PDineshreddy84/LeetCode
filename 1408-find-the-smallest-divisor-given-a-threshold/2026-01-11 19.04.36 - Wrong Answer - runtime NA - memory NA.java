class Solution {
    public int smallestDivisor(int[] nums, int t) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int ele:nums){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        int l=min,h=max;
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