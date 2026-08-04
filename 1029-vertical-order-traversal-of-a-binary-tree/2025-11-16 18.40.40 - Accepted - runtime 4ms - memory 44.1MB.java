/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        int col = 0;
        Queue<Map.Entry<TreeNode, Integer>> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();

        q.add(new java.util.AbstractMap.SimpleEntry<>(root, col));

        int min = 0;
        int max = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            // For this level only: column -> list of values at this row
            Map<Integer, List<Integer>> levelMap = new HashMap<>();

            for (int i = 0; i < size; i++) {
                Map.Entry<TreeNode, Integer> removed = q.remove();
                TreeNode node = removed.getKey();
                col = removed.getValue();

                // collect for this level
                levelMap.computeIfAbsent(col, k -> new ArrayList<>()).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                if (node.left != null) {
                    q.add(new java.util.AbstractMap.SimpleEntry<>(node.left, col - 1));
                }
                if (node.right != null) {
                    q.add(new java.util.AbstractMap.SimpleEntry<>(node.right, col + 1));
                }
            }

            // now sort values for each column at this level, and merge into global map m
            for (Map.Entry<Integer, List<Integer>> entry : levelMap.entrySet()) {
                int c = entry.getKey();
                List<Integer> list = entry.getValue();
                Collections.sort(list); // important for same row & col

                m.computeIfAbsent(c, k -> new ArrayList<>()).addAll(list);
            }
        }

        for (int i = min; i <= max; i++) {
            ans.add(m.get(i));
        }

        return ans;
    }
}
