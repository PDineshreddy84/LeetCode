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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode>q=new ArrayDeque<>();
        q.add(root);
         boolean alt=false;
        while(!q.isEmpty()){
            int sz=q.size();
            List<Integer>l=new ArrayList<>();
            while(sz-->0){
                if(!alt){
                    TreeNode t=q.removeFirst();
                    l.add(t.val);
                    if(t.left!=null){
                        q.addLast(t.left);
                    }
                    if(t.right!=null){
                        q.addLast(t.right);
                    }
                }
                else{
                    TreeNode t=q.removeLast();
                    l.add(t.val);
                    if(t.right!=null){
                        q.addFirst(t.right);
                    }
                    if(t.left!=null){
                        q.addFirst(t.left);
                    }
                }
            }
            alt=!alt;
            res.add(l);
        }
        return res;
    }
}