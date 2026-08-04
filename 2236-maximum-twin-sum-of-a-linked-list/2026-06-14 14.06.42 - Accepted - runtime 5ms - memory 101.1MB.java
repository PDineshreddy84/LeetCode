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
    public int pairSum(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        int i=0;
        while(true){
            i++;
            if(i==n/2)break;
            temp=temp.next;
        }
        ListNode rev=reverse(temp.next);
        temp.next=null;
        int sum=0;
        temp=head;
       while(temp!=null){
            sum=Math.max(temp.val+rev.val,sum);
            temp=temp.next;
            rev=rev.next;
       }
       return sum;
    }
    ListNode reverse(ListNode head){
        ListNode front=null;
        ListNode prev=null;
        while(head!=null){
            front=head.next;
            head.next=prev;
            prev=head;
            head=front;
        }
        return prev;
    }
}