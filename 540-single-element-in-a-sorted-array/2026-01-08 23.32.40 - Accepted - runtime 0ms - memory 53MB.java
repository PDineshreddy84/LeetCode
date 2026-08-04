class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        if(n==1){
            return nums[0];
        }
        if(n>1 && nums[0]!=nums[1]){
            return nums[0];
        }
        if(n>1 && nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        while(l<=h){
            int m=l+(h-l)/2;
            if(m<n-1 && m>0 && nums[m-1]!=nums[m] && nums[m]!=nums[m+1]){
                return nums[m];
            }
            if(((m>0 && nums[m]==nums[m-1] && m%2==0)||(m<n-1 && nums[m+1]==nums[m]) && (m+1)%2==0)){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return 0;
    }
}