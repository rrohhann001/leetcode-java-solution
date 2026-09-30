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
    public int[] nextLargerNodes(ListNode head) {
        // int count=0;
        // ListNode pre=null;
        // ListNode curr=head;
        // while(curr!=null){
        //     ListNode nextNode=curr.next;
        //     curr.next=pre;
        //     pre=curr;
        //     curr=nextNode;
        //     count++;
        // }

        // head=pre;
        // int[] arr=new int[count];
        // int nextGreater=head.val;
        // ListNode temp=head.next;
        
        // int i=count-1;
        // arr[i]=0;
        // i--;
        
        // while(temp!=null){
        //     if(nextGreater>temp.val){
        //         arr[i]=nextGreater;
        //     }
        //     else{
        //         arr[i]=0;
        //         nextGreater=temp.val;
        //     }
        //     temp=temp.next;
        //     i--;
        // }

        // return arr;
        
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }

        int[] arr=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            int val=temp.val;
            ListNode temp2=temp.next;
            while(temp2!=null){
                if(val<temp2.val){
                    arr[i]=temp2.val;
                    break;
                }
                temp2=temp2.next;
            }
            temp=temp.next;
            i++;
        }
        return arr;
    }
}