/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<1 || head==null || head.next==null){
            return head;
        }
        int size=sizeOfList(head);
        int c=0;
        ListNode curr=head;
        ListNode prev=null;
        while(true){
            ListNode last=prev;
            ListNode newEnd=curr;
            ListNode next=curr.next;
            for(int i=0;i<k;i++){
                c++;
                curr.next=prev;
                prev=curr;
                curr=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }
            else{
                head=prev;
            }
            newEnd.next=null;
            prev=newEnd;
            if((size-c)<k){
                prev.next=curr;
                break;
            }
        }
        return head;
    }
    public int sizeOfList(ListNode head){
        if(head==null){
            return 0;
        }
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}