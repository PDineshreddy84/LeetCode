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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>l=new ArrayList<>();
        if(root==null){
            return l;
        }
        helper(root,l);
        return l;
    }
    public void helper(TreeNode root,List<Integer>l){
        if(root.left!=null){
            helper(root.left,l);
        }
        if(root.right!=null){
            helper(root.right,l);
        }
        l.add(root.val);
    }
}