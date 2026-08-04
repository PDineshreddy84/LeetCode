/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int c=0;
        while(t1!=t2){
            if(t1.next==null){
                c++;
                t1=headB;
            }
            if(t2.next==null){
                t2=headA;
            }
            if(c>1)break;
            t1=t1.next;
            t2=t2.next;
            if(t1==t2){
                return t1;
            }
        }
        return null;
    }
}