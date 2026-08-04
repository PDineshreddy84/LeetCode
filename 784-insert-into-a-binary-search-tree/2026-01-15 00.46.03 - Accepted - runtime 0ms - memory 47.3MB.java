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
    public TreeNode insertIntoBST(TreeNode r, int val) {
        TreeNode root=r;
        TreeNode node =new TreeNode(val);
        if(root==null){
            return node;
        }
        while(root!=null){
            if(root.val>val){
                if(root.left==null){
                    root.left=node;
                    break;
                }
                root=root.left;
            }
            else{
                if(root.right==null){
                    root.right=node;
                    break;
                }
                root=root.right;
            }
        }
        return r;
    }       
}