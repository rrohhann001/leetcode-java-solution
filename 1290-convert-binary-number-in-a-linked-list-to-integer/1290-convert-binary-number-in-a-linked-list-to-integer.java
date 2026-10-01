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
    public int getDecimalValue(ListNode head) {

        //this is my logic and fully understand the logic 
        //this beats 100% and 0ms runtime
        // ListNode pre=null;
        // ListNode curr=head;
        // while(curr!=null){
        //     ListNode nextNode = curr.next;
        //     curr.next=pre;
        //     pre=curr;
        //     curr=nextNode;
        // }

        // curr=pre;
        // int ans=0;
        // int i=0;
        // while(curr!=null){
        //     if(curr.val==1){
        //         ans+=Math.pow(2,i);
        //     }
        //     i++;
        //     curr=curr.next;
        // }
        // return ans; 


        //this is not my ans and this beats
        ListNode temp=head;
        int ans=0;
        while(temp!=null){
            ans=ans*2+temp.val;
            temp=temp.next;
        } 
        return ans;      
    }
}