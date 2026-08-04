class Solution {
    public int findMaxLength(int[] nums) {
        int res=0,t=0,n=nums.length;
        for(int i=0;i<n;i++){
            int c0=0,c1=0;
            while(i<n && nums[i]==0){
                c0++;
                i++;
            }
            while(i<n && nums[i]==1){
                c1++;
                i++;
            }
            t=Math.min(c0,c1);
            res=Math.max(res,2*t);
        }
        for(int i=n-1;i>=0;i--){
            int c0=0,c1=0;
            while(i>=0 && nums[i]==0){
                c0++;
                i--;
            }
            while(i>=0 && nums[i]==1){
                c1++;
                i--;
            }
            t=Math.min(c0,c1);
            res=Math.max(res,2*t);
        }
        return res;
    }
}