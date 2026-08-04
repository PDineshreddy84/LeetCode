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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
       helper(root,k,pq);
       int ans=0;
       for(int i=0;i<k;i++){
        ans=pq.remove();
       }
       return ans;
    }
    public void helper(TreeNode root,int k,PriorityQueue<Integer>pq){
        if(root==null){
            return;
        }
        helper(root.left,k,pq);
        pq.add(root.val);
        helper(root.right,k,pq);
    }
}