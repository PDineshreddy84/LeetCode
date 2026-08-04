class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int m=nums[n-1];
        int sum=0;
        while(k--!=0){
            sum=sum+m;
            m++;
        }
        return sum;
    }
}