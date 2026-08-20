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

 //this is optimize code or logic
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;

        while(t1!=t2){
            t1 = (t1==null) ? headB : t1.next;
            t2 = (t2==null) ? headA : t2.next;
        }
        return t1;










        //this is my first approch and this beats 100% runtime 0 and but we can optimize this , optimize code is above
    //     int sizeA=0;
    //     int sizeB=0;
    //     ListNode tempA=headA;
    //     ListNode tempB=headB;

    //     while(tempA!=null){
    //         tempA=tempA.next;
    //         sizeA++;
    //     }

    //     while(tempB!=null){
    //         tempB=tempB.next;
    //         sizeB++;
    //     }

    //     ListNode temp1=headA;
    //     ListNode temp2=headB;

    //     while(sizeA!=sizeB){
    //         if(sizeA>sizeB){
    //             sizeA--;
    //             temp1=temp1.next;
    //         }
    //         else{
    //             sizeB--;
    //             temp2=temp2.next;
    //         }
    //     }

    //     while(temp1!=null){
    //         if(temp1==temp2){
    //             return temp2;
    //         }
    //         temp1=temp1.next;
    //         temp2=temp2.next;
    //     }

    //     return temp1;
        
    }
}