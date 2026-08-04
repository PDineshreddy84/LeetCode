class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int pref[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            pref[i]=sum;
        }
        if(pref[n-1]<target){
            return 0;
        }
        if(pref[0]==target){
            return 1;
        }
        int l=0,r=0,wl=0,min=Integer.MAX_VALUE;
        while(l<n && r<n){
            if(l==r){
                r++;
            }
            if(r<n && l<n &&pref[r]-pref[l]<target){
                r++;
            }
            else if(r<n && l<n && (pref[r]-pref[l])==target){ 
                l++;
                r++;
            }
            else{
                l++;
            }
            wl=r-l;
            min=Math.min(wl,min);
        }
        return min;
    }
}