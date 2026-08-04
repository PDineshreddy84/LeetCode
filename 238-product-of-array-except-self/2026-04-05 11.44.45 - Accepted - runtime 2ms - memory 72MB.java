class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1,n=nums.length,z=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }
            else{
                z++;
            }
        }
        if(z>1)prod=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(z>0){
                    nums[i]=0;
                }
                else{
                 nums[i]=prod/nums[i];
                }
            }
            else{
                nums[i]=prod;
            }
        }
        return nums;
    }
}