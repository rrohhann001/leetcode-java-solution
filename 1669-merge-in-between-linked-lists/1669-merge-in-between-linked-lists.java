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
        ListNode pre=null;
        ListNode curr=list1;
        while(curr!=null && b>=0){
            if(a==1){
                pre=curr;
            }
            curr=curr.next;
            a--;
            b--;
        }
        pre.next=list2;
        while(pre.next!=null){
            pre=pre.next;
        }
        pre.next=curr;
        return list1;
    }
}