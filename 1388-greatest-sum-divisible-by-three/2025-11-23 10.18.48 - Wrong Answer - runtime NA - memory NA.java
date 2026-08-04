class Solution {
    public int maxSumDivThree(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum % 3 ==0){
            return sum;
        }
        for(int num:nums){
            if((sum-num)%3==0){
                return sum-num;
            }
        }
        return 0;
    }
}