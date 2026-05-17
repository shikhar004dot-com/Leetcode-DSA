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
        ListNode ans=new ListNode();
        ListNode dn=ans;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                dn.next=list1;;
                list1=list1.next;
            }
            else{
                dn.next=list2;
                list2=list2.next;
            }
            dn=dn.next;
        }
        if(list1!=null){
            dn.next=list1;
        }
        if(list2!=null){
            dn.next=list2;
        }
        return ans.next;        
    }
}