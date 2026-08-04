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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        Map<Integer,ListNode>m=new HashMap<>();
        m.put(0,dummy);
        int prefSum=0;
        while(temp!=null){
            prefSum+=temp.val;
            if(m.containsKey(prefSum)){
                ListNode st=m.get(prefSum);
                int pf=prefSum;
                ListNode t=st;
                while(t.next!=temp){
                    t=t.next;
                   pf+=t.val;
                   m.remove(pf);
                }
                st.next=temp.next;
            }
            else{
                m.put(prefSum,temp);
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}