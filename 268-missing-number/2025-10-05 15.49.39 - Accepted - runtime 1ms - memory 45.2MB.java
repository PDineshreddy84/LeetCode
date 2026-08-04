class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int c=nums[i];
            if(c<n && nums[i]!=nums[c]){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(nums[k]!=k){
                return k;
            }
        }
        return n;
    }
}