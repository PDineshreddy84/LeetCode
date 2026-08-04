class Solution {
    public long perfectPairs(int[] nums) {
        int n=nums.length;
        long c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                long min=Math.min(Math.abs(nums[i]-nums[j]),Math.abs(nums[i]+nums[j]));
                long max=Math.max(Math.abs(nums[i]-nums[j]),Math.abs(nums[i]+nums[j]));
                long mi=Math.min(Math.abs(nums[i]),Math.abs(nums[j]));
                long ma=Math.max(Math.abs(nums[i]),Math.abs(nums[j])); 
                if(min<=mi && max>=ma){
                    c++;
                }
            }
        }
        return c;
    }
}