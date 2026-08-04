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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode f=list1;
        ListNode s=list2;
        ListNode ans=new ListNode();
        ListNode temp=ans;
        while(f!=null && s!=null){
            if(f.val<=s.val){
                temp.next=f;
                f=f.next;
                temp=temp.next;
            }
            else{
                temp.next=s;
                s=s.next;
                temp=temp.next;
            }
        }
        temp.next=(f!=null)?f:s;
        return ans.next;
    }
}