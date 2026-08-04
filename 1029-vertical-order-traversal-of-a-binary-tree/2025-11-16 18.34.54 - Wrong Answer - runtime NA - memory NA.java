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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        int col=0;
        Queue<Map.Entry<TreeNode,Integer>>q=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>>m=new HashMap<>();
        q.add(new java.util.AbstractMap.SimpleEntry<>(root,col));
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            Map.Entry<TreeNode,Integer>removed=q.remove();
            root=removed.getKey();
            col=removed.getValue();
            if(root!=null){
                if(!m.containsKey(col)){
                    m.put(col,new ArrayList<Integer>());
                }
                m.get(col).add(root.val);
                min=Math.min(min,col);
                max=Math.max(max,col);
            }
            if(root.left!=null){
                q.add(new java.util.AbstractMap.SimpleEntry<>(root.left,col-1));
            }
            if(root.right!=null){
                q.add(new java.util.AbstractMap.SimpleEntry<>(root.right,col+1));
            }
        }
        for(int i=min;i<=max;i++){
            List<Integer>l=m.get(i);
            Collections.sort(l);
            ans.add(l);
        }
        return ans;
    }
}