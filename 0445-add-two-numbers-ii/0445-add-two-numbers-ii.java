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
        // follow up-> that is without revrese linked list 
        //so now this is the follow up answer 
        //and this beats 18.19% and runtime is 18.19% 

        // Stack<Integer> st1=new Stack<>();
        // Stack<Integer> st2=new Stack<>();
        // while(l1!=null || l2!=null){
        //     if(l1!=null){
        //         st1.push(l1.val);
        //         l1=l1.next;
        //     }
        //     if(l2!=null){
        //         st2.push(l2.val);
        //         l2=l2.next;
        //     }
        // }

        // int carry=0;
        // ListNode head=null;
        // while(!st1.isEmpty() || !st2.isEmpty() || carry>0){
        //     int digit=carry;
        //     if(!st1.isEmpty()){
        //         digit+=st1.pop();
        //     }
        //     if(!st2.isEmpty()){
        //         digit+=st2.pop();
        //     }
        //     carry=digit/10;
        //     digit=digit%10;
        //     //adding at top 
        //     ListNode newNode=new ListNode(digit);
        //     newNode.next=head;
        //     head=newNode;
        // }
        // return head;



        //without using stack and reverse the both linked list 

        ListNode t1=reverse(l1);
        ListNode t2=reverse(l2);
        int carry=0;
        ListNode head=null;
        while(t1!=null || t2!=null){
            int digit=carry;
            if(t1!=null ){
                digit+=t1.val;
                t1=t1.next;
            }
            if(t2!=null ){
                digit+=t2.val;
                t2=t2.next;
            }
            carry=digit/10;
            digit=digit%10;
            //adding at top 
            ListNode newNode=new ListNode(digit);
            newNode.next=head;
            head=newNode;
        }
        if(carry!=0){
            ListNode newNode=new ListNode(carry);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    private ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode pre=null;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=pre;
            pre=current;
            current=nextNode;
        }
        return pre;
    }


}