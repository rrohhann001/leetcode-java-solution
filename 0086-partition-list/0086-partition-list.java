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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode pre=null;
        ListNode curr=head;

        while(curr!=null){
            int num=curr.val;
            if(x<=num){
                temp.next=curr;
                temp=temp.next;
                if(pre==null){ 
                    curr=head.next;
                    head.next=null;
                    head=curr;
                }
                else{
                    pre.next=curr.next;
                    curr.next=null;
                    curr=pre.next;
                }
            }
            else{
                pre=curr;
                curr=curr.next;
            }
        }

        if(pre==null){
            return dummy.next;
        }
        pre.next=dummy.next;
        return head;
        
    }
}