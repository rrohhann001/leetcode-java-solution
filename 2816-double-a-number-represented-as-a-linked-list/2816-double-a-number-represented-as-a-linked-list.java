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

    //this is my solution and my first approch that beats 77.26% and beats 4ms
    // public ListNode doubleIt(ListNode head) {
    //     head=reverse(head);
    //     ListNode temp=head;
    //     int carry=0;
    //     while(temp!=null){
    //         int digit=temp.val*2+carry;
    //         carry=digit/10;
    //         digit=digit%10;
    //         temp.val=digit;
    //         temp=temp.next;
    //     }
    //     head=reverse(head);
    //     if(carry!=0){
    //         ListNode newNode=new ListNode(carry,head);
    //         head=newNode;
    //     }
    //     return head;   
    // }


    //     private ListNode reverse(ListNode head){
    //     ListNode pre=null;
    //     ListNode current=head;
    //     while(current!=null){
    //         ListNode nextNode=current.next;
    //         current.next=pre;
    //         pre=current;
    //         current=nextNode;
    //     }
    //     return pre;
    // }


    //this is best approch that is copied by other and now i understand this 
    public ListNode doubleIt(ListNode head) {
        if(head.val>=5){
            head=new ListNode(0,head);
        }
        ListNode current = head;
        while(current!=null){
            current.val=current.val*2;

            if(current.next!=null&&current.next.val>=5){
                current.val+=1;
            }

            current.val=current.val%10;
            current=current.next;
        }

        return head;
    }
}