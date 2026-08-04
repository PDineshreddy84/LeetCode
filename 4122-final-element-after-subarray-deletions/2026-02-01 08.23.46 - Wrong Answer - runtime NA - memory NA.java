class Solution {
    public int finalElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}