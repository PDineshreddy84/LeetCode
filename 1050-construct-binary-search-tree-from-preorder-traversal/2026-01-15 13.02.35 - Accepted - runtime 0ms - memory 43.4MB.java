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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<n;i++){
            Insert(preorder[i],root);
        }
        return root;
    }
    public void Insert(int ele,TreeNode root){
        TreeNode node=new TreeNode(ele);
        while(root!=null){
            if(root.val>ele){
                if(root.left==null){
                    root.left=node;
                    break;
                }
                else{
                    root=root.left;
                }
            }
            else{
                if(root.right==null){
                    root.right=node;
                    break;
                }
                else{
                    root=root.right;
                }
            }
        }
    }
}