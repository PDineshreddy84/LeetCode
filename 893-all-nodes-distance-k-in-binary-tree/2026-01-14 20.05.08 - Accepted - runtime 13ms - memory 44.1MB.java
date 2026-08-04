/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Map<TreeNode,TreeNode>m=new HashMap<>();
        Map<TreeNode,Boolean>vis=new HashMap<>();
        markParents(root,m);
        Queue<TreeNode>q=new LinkedList<>();
        q.add(target);
        vis.put(target,true);
        int cd=0;
        while(!q.isEmpty()){
            int sz=q.size();
            if(cd==k)break;
            cd++;
            for(int i=0;i<sz;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null && vis.get(curr.left)==null){
                    q.add(curr.left);
                    vis.put(curr.left,true);
                }
                if(curr.right!=null && vis.get(curr.right)==null){
                    q.add(curr.right);
                    vis.put(curr.right,true);
                }
                if(m.get(curr)!=null && vis.get(m.get(curr))==null){
                    q.add(m.get(curr));
                    vis.put(m.get(curr),true);
                }
            }
        }
        while(!q.isEmpty()){
            ans.add(q.remove().val);
        }
        return ans;
    }
    public void markParents(TreeNode root,Map<TreeNode,TreeNode>m){
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr.left!=null){
                m.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                m.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
}