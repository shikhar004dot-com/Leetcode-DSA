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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode l2=slow.next;
        slow.next=null;
        ListNode pre=null;
        while(l2!=null){
            ListNode nxt=l2.next;
            l2.next=pre;
            pre=l2;
            l2=nxt;
        }
        ListNode l1=head;
        l2=pre;
        while(l2!=null){
            ListNode nxt1=l1.next;
            ListNode nxt2=l2.next;
            l1.next=l2;
            l2.next=nxt1;
            l1=nxt1;
            l2=nxt2;
        }
    }
}