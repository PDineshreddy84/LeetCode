/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        if(head.next==null){
            Node n=new Node(head.val);
            n.next=null;
            if(head.random==null)n.random=null;
            else n.random=n;
            return n;
        }
        Node temp=head;
        Node next=head.next;
        while(temp!=null){
            Node n=new Node(temp.val);
            temp.next=n;
            n.next=next;
            temp=next;
            if(next!=null)next=next.next;
        }
        temp=head;
        next=head.next;
        while(temp!=null){
            if(temp.random!=null){
                next.random=temp.random.next;
            }else{
                next.random=null;
            }
            temp=temp.next.next;
            if(next.next!=null)
            next=next.next.next;
        }
        Node res=head.next;
        temp=head;
        next=head.next;
        while(next!=null && next.next!=null){
            temp.next=temp.next.next;
            next.next=next.next.next;
            temp=temp.next;
            next=next.next;
        }
        temp.next=null;
        return res;
    }
}