class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int c=nums[i]-1;
            if(nums[c]!=nums[i]){
                int t=nums[c];
                nums[c]=nums[i];
                nums[i]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(nums[k]!=k+1){
                return nums[k];
            }
        }
        return 0;
    }
}