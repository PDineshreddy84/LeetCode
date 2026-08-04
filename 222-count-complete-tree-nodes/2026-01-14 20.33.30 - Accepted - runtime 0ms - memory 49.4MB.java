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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int lh=LeftHeight(root);
        int rh=RightHeight(root);
        if(lh==rh){
            return ((2<<(lh))-1);
        }
        else return countNodes(root.left)+countNodes(root.right)+1;
    }
    public int LeftHeight(TreeNode root){
        int c=0;
        while(root.left!=null){
            root=root.left;
            c++;
        }
        return c;
    }
    public int RightHeight(TreeNode root){
        int c=0;
        while(root.right!=null){
            root=root.right;
            c++;
        }
        return c;
    }
}