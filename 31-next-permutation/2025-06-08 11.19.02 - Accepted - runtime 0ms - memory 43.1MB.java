class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[p]){
                int t=nums[i];
                nums[i]=nums[p];
                nums[p]=t;
                break;
            }
        }
        reverse(nums,p+1,n-1);
    }
    public static int[] reverse(int[] nums,int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
        return nums;
    }
}