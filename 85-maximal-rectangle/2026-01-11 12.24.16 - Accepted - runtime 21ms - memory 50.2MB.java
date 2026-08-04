class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix[0].length, maxArea = 0;
        int[] heights = new int[n + 1];
        for (char[] row : matrix) {
            for (int i = 0; i < n; i++)
                heights[i] = row[i] == '1' ? heights[i] + 1 : 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            for (int i = 0; i < n + 1; i++) {
                while (stack.peek() != -1 && heights[i] < heights[stack.peek()]) {
                    int h = heights[stack.pop()];
                    int w = i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, h * w);
                }
                stack.push(i);
            }
        }
        return maxArea;
    }
}