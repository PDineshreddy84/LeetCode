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
    public ListNode rotateRight(ListNode head, int k) {
        int n=0,t=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==0||n==1){
            return head;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        temp=head;
        while(temp!=null){
            t++;
            if(t==n-k){
                break;
            }
            temp=temp.next;
        }
        ListNode head2=temp.next;
        temp.next=null;
        temp=head2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return head2;
    }
}