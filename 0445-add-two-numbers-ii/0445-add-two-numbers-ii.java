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
        //first approch is reverse both linked lust and then pluse them but here is given a
        // follow up-> that is without revrese linked list 

        //so now this is the follow up answer 

        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(l1!=null || l2!=null){
            if(l1!=null){
                st1.push(l1.val);
                l1=l1.next;
            }
            if(l2!=null){
                st2.push(l2.val);
                l2=l2.next;
            }
        }

        int carry=0;
        ListNode head=null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry>0){
            int digit=carry;
            if(!st1.isEmpty()){
                digit+=st1.pop();
            }
            if(!st2.isEmpty()){
                digit+=st2.pop();
            }
            carry=digit/10;
            digit=digit%10;
            ListNode newNode=new ListNode(digit);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}