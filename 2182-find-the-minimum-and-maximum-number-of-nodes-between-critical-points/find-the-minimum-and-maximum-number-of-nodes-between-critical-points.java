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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int mind=Integer.MAX_VALUE,maxd=-1;
        ListNode temp=head.next;
        ListNode prev=head;
        int sc=-1,lc=-1,lrc=-1;
        int i=1;
        while(temp.next!=null){
            if(prev.val>temp.val && temp.next.val>temp.val){
                if(sc==-1){
                    sc=i;
                }
                if(lrc!=-1 && lrc!=i){
                    mind=Math.min(mind,i-lrc);
                }
                lc=i;
                lrc=i;
            }
            if(prev.val<temp.val && temp.next.val<temp.val){
                if(lrc!=-1 && lrc!=i){
                    mind=Math.min(mind,i-lrc);
                }
                if(sc==-1){
                    sc=i;
                }
                lc=i;
                lrc=i;
            }
            prev=temp;
            temp=temp.next;
            i++;
        }
        if(sc==lc)return new int[]{-1,-1};
        return new int[]{mind,lc-sc};
    }
}