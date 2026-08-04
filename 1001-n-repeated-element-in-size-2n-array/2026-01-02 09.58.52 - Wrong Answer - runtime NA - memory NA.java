class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}