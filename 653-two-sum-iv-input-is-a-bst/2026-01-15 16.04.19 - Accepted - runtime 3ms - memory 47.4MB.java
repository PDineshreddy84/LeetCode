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
    public class BSTIterator{
        Stack<TreeNode>s=new Stack<>();
        boolean reverse=true;
        public BSTIterator(TreeNode root,boolean isreverse){
            reverse=isreverse;
            PushAll(root);
        }
        public int next(){
            TreeNode rem=s.pop();
            if(reverse==false){
                PushAll(rem.right);
            }
            else{
                PushAll(rem.left);
            }
            return rem.val;
        }
        public void PushAll(TreeNode root){
            while(root!=null){
                s.push(root);
                if(reverse==false){
                    root=root.left;
                }
                else{
                    root=root.right;
                }
            }
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k)return true;
            if(i+j<k)i=l.next();
            else j=r.next();
        }
        return false;
        // Set<Integer>s=new HashSet<>();
        // return helper(root,s,k);
        
    }
    // public boolean helper(TreeNode node,Set<Integer>s,int k){
    //     if(node == null){
    //         return false;
    //     }
    //     if(s.contains(k-node.val)){
    //         return true;
    //     }
    //     s.add(node.val);
    //     return helper(node.left,s,k) || helper(node.right,s,k);
    // }
}