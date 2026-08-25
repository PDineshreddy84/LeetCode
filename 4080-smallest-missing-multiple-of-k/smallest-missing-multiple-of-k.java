class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        int t=k;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==t){
                t+=k;
            }
            else if(nums[i]>t){
                break;
            }
        }
        return t;
    }
}