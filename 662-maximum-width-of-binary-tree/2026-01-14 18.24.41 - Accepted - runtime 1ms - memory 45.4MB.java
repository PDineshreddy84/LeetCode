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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int sz=q.size();
            int min=q.peek().num;
            int f=0,l=0;
            for(int i=0;i<sz;i++){
                int curr_id=q.peek().num-min;
                TreeNode curr_node=q.remove().node;
                if(i==0)f=curr_id;
                if(i==sz-1)l=curr_id;
                if(curr_node.left!=null){
                    q.add(new Pair(curr_node.left,curr_id*2+1));
                }
                if(curr_node.right!=null){
                    q.add(new Pair(curr_node.right,curr_id*2+2));
                }
            }
            ans=Math.max(ans,l-f+1);
        }
        return ans;
    }
    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode node,int num){
            this.node=node;
            this.num=num;
        }
    }
}