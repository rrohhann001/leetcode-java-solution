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
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode t1=null;
        for(int i=0;i<lists.length;i++){
           t1=margeSort(t1,lists[i]); 
        }
        
        return t1;
        
    }
    private static ListNode margeSort(ListNode l1, ListNode l2){
        if(l1==null && l2==null){
            return l1;
        }

        ListNode dummy=new ListNode();
        ListNode temp=dummy;

        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            } else{
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
        }

        if(l1==null){
            temp.next=l2;
        }
        else if(l2==null){
            temp.next=l1;
        }
    temp=dummy.next;
    dummy.next=null;
    return temp;
    }
    
}