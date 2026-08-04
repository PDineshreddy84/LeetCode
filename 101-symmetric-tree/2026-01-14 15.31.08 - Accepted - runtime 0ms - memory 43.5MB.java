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
    public boolean isSymmetric(TreeNode root) {
        // if(root==null){
        //     return true;
        // }
        // Queue<TreeNode>q=new LinkedList<>();
        // q.add(root.left);
        // q.add(root.right);
        // while(!q.isEmpty()){
        //     TreeNode l=q.remove();
        //     TreeNode r=q.remove();
        //     if(l==null && r== null){
        //         continue;
        //     }
        //     if(l==null || r== null){
        //         return false;
        //     }
        //     if(l.val != r.val ){
        //         return false;
        //     }
        //     q.add(l.left);
        //     q.add(r.right);
        //     q.add(l.right);
        //     q.add(r.left);
        // }
        // return true;
        return root==null||isSymmetricHelp(root.left,root.right);
    }
    public boolean isSymmetricHelp(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val){
            return false;
        }
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
}