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
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0,0));
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>m=new TreeMap<>();
        while(!q.isEmpty()){
            Pair p=q.poll();
            TreeNode node=p.node;
            int v=p.vertical;
            int l=p.level;
            m.putIfAbsent(v,new TreeMap<>());
            m.get(v).putIfAbsent(l,new PriorityQueue<>());
            m.get(v).get(l).offer(node.val);
            if(node.left!=null){
                q.offer(new Pair(node.left,v-1,l+1));
            }
            if(node.right!=null){
                q.offer(new Pair(node.right,v+1,l+1));
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>ls:m.values()){
            List<Integer>list=new ArrayList<>();
            for(PriorityQueue<Integer>pq:ls.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
    class Pair{
        TreeNode node;
        int vertical;
        int level;
        Pair(TreeNode n,int v,int l){
            node=n;
            vertical=v;
            level=l;
        }
    }
}