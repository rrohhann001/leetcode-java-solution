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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr=list1;
        ListNode pre=null;

        while(a>1){
            curr=curr.next;
            a--;
            b--;
        }
        ListNode startPoint=curr;
        while(b!=-1){
            curr=curr.next;
            b--;
        }
        startPoint.next=list2;
        ListNode tail=list2;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=curr;
        return list1;
    }
    
}