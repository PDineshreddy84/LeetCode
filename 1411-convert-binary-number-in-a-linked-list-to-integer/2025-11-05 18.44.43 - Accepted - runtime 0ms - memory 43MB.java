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
    public int getDecimalValue(ListNode head) {
        ListNode t=head;
        int n=0;
        while(t!=null){
            n++;
            t=t.next;
        }
        t=head;
        int res=0;
        while(t!=null){
            n--;
            if(t.val==1){
                res+=Math.pow(2,n);
            }
            t=t.next;
        }
        return res;
    }
}