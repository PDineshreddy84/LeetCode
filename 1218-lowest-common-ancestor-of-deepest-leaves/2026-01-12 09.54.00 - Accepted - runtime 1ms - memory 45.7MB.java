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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return null;
        }
        int l=height(root.left);
        int r=height(root.right);
        TreeNode node=root;
        if(l==r){
            return node;
        }
        if(l>r){
           node=lcaDeepestLeaves(root.left);
        }
        else{
            node=lcaDeepestLeaves(root.right);
        }
        return node;
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        return 1+Math.max(l,r);
    }
}