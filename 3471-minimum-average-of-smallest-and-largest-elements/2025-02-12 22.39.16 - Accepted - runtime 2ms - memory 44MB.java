class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        double min=(nums[l-1]+nums[0])/2.0;
        for(int i=1;i<l-1;i++){
        double avg=(nums[l-i-1]+nums[i])/2.0;
            if(avg<min){
                min=avg;
            }
        }
        return min;
    }
}