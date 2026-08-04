class Solution {
    public int jump(int[] nums) {
        int j=0,n=nums.length,l=0,r=0;
        while(r<n-1){
            int far=0;
            for(int i=l;i<=r;i++){
                far=Math.max(far,nums[i]+i);
            }
            l=r+1;
            r=far;
            j++;
    }
        return j;
    }
}