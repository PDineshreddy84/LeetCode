class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int i=0;i<nums.length;i++){
            l=Math.max(nums[i],l);
            r+=nums[i];
        }
        while(l<r){
            int m=l+(r-l)/2;
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if((sum+num) > m){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces > k){
                l=m+1;
            }
            else{
                r=m;
            }
        }
        return l;
    }
}