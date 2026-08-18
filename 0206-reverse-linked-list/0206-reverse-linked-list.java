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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode pre=null;
        ListNode current=head;
        ListNode next=current.next;

        while(current!=null){
            current.next=pre;
            pre=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }

        return pre;

        //my first approch this work properly but not efficient way->
        // ListNode temp1=head;
        // ArrayList<Integer> arr=new ArrayList();
        // while(temp1!=null){
        //     arr.add(temp1.val);
        //     temp1=temp1.next;
        // }
        // ListNode temp2=head;
        // int i=arr.size()-1;
        // while(temp2!=null){
        //     temp2.val=arr.get(i);
        //     temp2=temp2.next;
        //     i--;
        // }

        // return head;
    }
}