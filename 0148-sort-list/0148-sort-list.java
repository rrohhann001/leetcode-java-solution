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
    public ListNode sortList(ListNode head) {
        return margeSort(head);
    }

    private ListNode marge(ListNode l1, ListNode l2){
        ListNode l3=new ListNode(-1);
        ListNode head=l3;
        while(l1!=null && l2!=null){
            
            if(l1.val<=l2.val){
                l3.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                l3.next=new ListNode(l2.val);
                l2=l2.next;
            }
            l3=l3.next;
        }
        if(l1!=null){
            l3.next=l1;
        }
        else{
            l3.next=l2;
        }
        ListNode t1=head;
        head=head.next;
        t1.next=null;
        return head;
    }

    private ListNode margeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode pre=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pre.next=null;
        ListNode head1=margeSort(head);
        ListNode head2=margeSort(slow);

        ListNode ans=marge(head1,head2);
        return ans;
    } 
}