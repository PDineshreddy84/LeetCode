class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            int m=0;
            for(int j=i;j<n;j++){
                if(target==nums[j]){
                    m++;
                }
                if(m>(j-i+1)/2){
                    c++;
                }
            }
        }
        return c;
    }
}