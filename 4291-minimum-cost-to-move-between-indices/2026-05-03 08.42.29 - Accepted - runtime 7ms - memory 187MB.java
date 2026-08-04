class Solution {
    public int[] minCost(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] lomviretas = Arrays.copyOf(nums, n);
        int[] closest = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                closest[i] = 1;
            } else if (i == n - 1) {
                closest[i] = n - 2;
            } else {
                int left = Math.abs(nums[i] - nums[i - 1]);
                int right = Math.abs(nums[i] - nums[i + 1]);

                if (left <= right) {
                    closest[i] = i - 1;
                } else {
                    closest[i] = i + 1;
                }
            }
        }
        int[] forward = new int[n];
        for (int i = 1; i < n; i++) {
            int direct = nums[i] - nums[i - 1];

            if (closest[i - 1] == i) {
                forward[i] = forward[i - 1] + 1;
            } else {
                forward[i] = forward[i - 1] + direct;
            }
        }
        int[] backward = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            int direct = nums[i + 1] - nums[i];

            if (closest[i + 1] == i) {
                backward[i] = backward[i + 1] + 1;
            } else {
                backward[i] = backward[i + 1] + direct;
            }
        }

        int q = queries.length;
        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            if (l < r) {
                ans[i] = forward[r] - forward[l];
            } else {
                ans[i] = backward[r] - backward[l];
            }
        }

        return ans;
    }
}