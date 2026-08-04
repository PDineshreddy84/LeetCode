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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0,t=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        n=Math.abs(n-c);
        temp=head;
        if(n==0 && temp.next==null){
            return null;
        }
        else if(n==0){
            return head.next;
        }
        while(temp!=null){
            t++;
            if(t==n){
                if(temp.next.next==null){
                    temp.next=null;
                }
                else
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}