class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] != i + 1) {
                int c = nums[i] - 1;
                if (nums[c] != nums[i]) {
                    int t = nums[c];
                    nums[c] = nums[i];
                    nums[i] = t;
                }else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}