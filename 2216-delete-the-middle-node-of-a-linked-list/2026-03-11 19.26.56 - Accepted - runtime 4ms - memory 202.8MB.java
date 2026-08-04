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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        c=c/2;
        if(c==0)return null;
        temp=head;
        int t=0;
        while(temp!=null){
            t++;
            if(t==c){
                if(temp.next.next==null){
                    temp.next=null;
                }
                else{
                    temp.next=temp.next.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}