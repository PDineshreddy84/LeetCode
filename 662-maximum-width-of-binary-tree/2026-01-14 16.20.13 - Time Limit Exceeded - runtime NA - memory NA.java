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
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int max=1;
        int h=height(root);
        int l=1;
        while(l<=h){
            int n=q.size();
            while(n-->0){
                TreeNode rem=q.remove();
                if(rem==null){
                    q.add(null);
                    q.add(null);
                }
                else{
                    q.add(rem.left);
                    q.add(rem.right);
                }
            }
            int lm=0,rm=0,c=0;
            for(TreeNode node:q){
                c++;
                if(node!=null){
                    lm=c;
                    break;
                }
            }
            c=0;
            for(TreeNode node:q){
                c++;
                if(node!=null){
                    rm=c;
                }
            }
            // System.out.println(lm+" "+rm+" "+max);
            max=Math.max(max,rm-lm+1);
            l++;
        }
        return max;
    }
    int height(TreeNode root){
        if(root==null)return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}