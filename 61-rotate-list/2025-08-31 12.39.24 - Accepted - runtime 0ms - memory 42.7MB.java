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
        ListNode last=null;
        while(temp!=null){
            n++;
            last=temp;
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
                ListNode l=temp.next;
                temp.next=null;
                last.next=head;
                return l;
            }
            temp=temp.next;
        }
        return head;
    }
}