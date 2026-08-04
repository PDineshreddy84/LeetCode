class Solution {
    public int countArrays(int[] original, int[][] bounds) {
        int min = bounds[0][1] - bounds[0][0];
        for (int i = 1; i < bounds.length; i++) {
            if (bounds[i][1] - bounds[i][0] < min) {
                min = bounds[i][1] - bounds[i][0];
            }
        }
        if (min == 0) {
            return 0;
        } else
            return min + 1;
    }
}