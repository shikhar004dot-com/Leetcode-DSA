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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1= new Stack<>();
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        Stack<Integer> s2= new Stack<>();
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        int c=0;
        ListNode newHead=null;
        while(!s1.isEmpty() || !s2.isEmpty() || c!=0){
            int n1;
            int n2;
            if(!s1.isEmpty()){
                n1=s1.pop();
            } 
            else{
                n1=0;
            }
            if(!s2.isEmpty()){
                n2=s2.pop();
            } else {
                n2=0;
            }
            int dn=n1+n2+c;
            ListNode newNode=new ListNode(dn%10);
            newNode.next=newHead;
            newHead=newNode;
            c=dn/10;
        }
        return newHead;
    }
}