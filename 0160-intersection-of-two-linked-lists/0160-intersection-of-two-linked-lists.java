/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA=0;
        int sizeB=0;
        ListNode tempA=headA;
        ListNode tempB=headB;

        while(tempA!=null){
            tempA=tempA.next;
            sizeA++;
        }

        while(tempB!=null){
            tempB=tempB.next;
            sizeB++;
        }

        ListNode temp1=headA;
        ListNode temp2=headB;

        while(sizeA!=sizeB){
            if(sizeA>sizeB){
                sizeA--;
                temp1=temp1.next;
            }
            else{
                sizeB--;
                temp2=temp2.next;
            }
        }

        while(temp1!=null){
            if(temp1==temp2){
                return temp2;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1;
        
    }
}