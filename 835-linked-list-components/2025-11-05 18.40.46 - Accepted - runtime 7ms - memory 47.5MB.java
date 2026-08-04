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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int count=0,con=0;
        ListNode t=head;
        while(t!=null){
            while(t!=null && s.contains(t.val)){
                t=t.next;
                if(con==0){
                    count++;
                }
                con++;
            }
            con=0;
            if(t!=null){
                t=t.next;
            }
        }
        return count;
    }
}