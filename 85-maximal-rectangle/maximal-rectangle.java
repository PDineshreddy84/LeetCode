class Solution {
    public int maximalRectangle(char[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];

        int max = 0;

        for (int i = 0; i < n; i++) {

            // Build histogram for current row
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            // Largest rectangle in histogram
            max = Math.max(max, getMax(height));
        }

        return max;
    }

    int getMax(int[] height) {

        int n = height.length;

        Stack<Integer> st = new Stack<>();

        int max = 0;

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && height[i] <= height[st.peek()]) {

                max = Math.max(max, calculate(st, i, height));
            }

            st.push(i);
        }

        // Process remaining bars
        int i = n;

        while (!st.isEmpty()) {

            max = Math.max(max, calculate(st, i, height));
        }

        return max;
    }

    int calculate(Stack<Integer> st, int i, int[] height) {

        int popped = st.pop();

        int width;

        if (st.isEmpty()) {
            width = i;
        } else {
            width = i - 1 - st.peek();
        }

        return height[popped] * width;
    }
}