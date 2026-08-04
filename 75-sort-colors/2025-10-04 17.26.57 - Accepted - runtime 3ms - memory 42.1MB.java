class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            boolean swaped=false;
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                    swaped=true;
                }
            }
            if(!swaped){
                return;
            }
        }
    }
}