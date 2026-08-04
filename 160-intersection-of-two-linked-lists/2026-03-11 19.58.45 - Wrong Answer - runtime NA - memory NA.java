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
        int c1=0,c2=0;
        while(t1!=t2){
            if(t1.next==null){
                c1++;
                t1=headB;
            }
            else{
               t1=t1.next;
            }
            if(t2.next==null){
                c2++;
                t2=headA;
            }
            else{
                t2=t2.next;
            }
            if(c1>1 || c2>1)break;
            if(t1==t2){
                return t1;
            }
        }
        return null;
    }
}