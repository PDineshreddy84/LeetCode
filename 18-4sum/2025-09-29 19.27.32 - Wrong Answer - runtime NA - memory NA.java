class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i+1; j < n - 2; j++) {
                int l = j + 1, r = n - 1;
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] + nums[j] == target) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r], nums[j]));
                        l++;
                        r--;
                    } else if (nums[i] + nums[l] + nums[r] +nums[j] < 0) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}