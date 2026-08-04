class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int c=nums[i]-1;
            if(nums[c]!=nums[i]){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<n;k++){
            if(nums[k]!=k+1){
                return new int[]{nums[k],k+1};
            }
        }
        return new int[]{-1,-1};
    }
}