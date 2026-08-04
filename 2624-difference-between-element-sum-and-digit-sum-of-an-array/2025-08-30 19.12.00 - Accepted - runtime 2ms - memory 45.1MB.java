class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,digitSum=0,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>9){
                digitSum+=digitSum(nums[i]);
            }
            else{
                digitSum+=nums[i];
            }
        }
        return Math.abs(sum-digitSum);
    }
    public static int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}