/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Node temp=root;
        Queue<Node>q=new LinkedList<>();
        q.add(temp);
        Node t=null;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                t=q.remove();
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    t.left.next=t.right;
                    q.add(t.right);
                }
                if(sz>0){
                    Node req=q.peek();
                    if(req.left!=null){
                     t.right.next=req.left;
                    }
                }
            }
            t.next=null;
        }
        t.next=null;
        return root;
    }
}