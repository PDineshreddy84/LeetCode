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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer>s=new HashSet<>();
        return helper(root,s,k);
    }
    public boolean helper(TreeNode node,Set<Integer>s,int k){
        if(node == null){
            return false;
        }
        if(s.contains(k-node.val)){
            return true;
        }
        else{
            s.add(node.val);
        }
        return helper(node.left,s,k) || helper(node.right,s,k);
    }
}