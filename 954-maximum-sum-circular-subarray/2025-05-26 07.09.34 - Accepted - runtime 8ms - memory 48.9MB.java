class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int cmax=0,cmin=0,min=nums[0],max=nums[0],ns=0,cs=0,ts=0;
        for(int i=0;i<n;i++){
            cmax=Math.max(cmax+nums[i],nums[i]);
            max=Math.max(cmax,max);
            cmin=Math.min(cmin+nums[i],nums[i]);
            min=Math.min(cmin,min);
            ts+=nums[i];
        }
        ns=max;
        cs=ts-min;
        if(ts==min){
            return ns;
        }
        return Math.max(cs,ns);
    }
}