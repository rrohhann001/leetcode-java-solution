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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode pre=null;
        ListNode slow=head;
        ListNode fast=head;
    
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;

            //rev
            ListNode nextNode=slow.next;
            slow.next=pre;
            pre=slow;
            slow=nextNode;    
        }

        //In case of even linked list 
        if(fast==null){
            while(pre!=null){
                if(pre.val!=slow.val){
                    return false;
                }
                pre=pre.next;
                slow=slow.next;
            }
        }

        //In case of odd linked list, move the slow pointer by 1 step
        else{
            slow=slow.next;
            while(pre!=null){
                if(pre.val!=slow.val){
                    return false;
                }
                pre=pre.next;
                slow=slow.next;
            }
        }

        return true;







        //this is my first approch, that takes more time and space complexity 
        // ListNode pre=null;
        // ListNode current=head;
        // ListNode next=current.next;
        // ListNode temp=head;
        // StringBuilder str1=new StringBuilder();
        // StringBuilder str2=new StringBuilder();

        // while(temp!=null){
        //     str1.append(temp.val);
        //     temp=temp.next;
        // }
        
        // while(current!=null){
        //     current.next=pre;
        //     pre=current;
        //     current=next;
        //     if(next!=null){
        //         next=next.next;
        //     }
        // }

        // while(pre!=null){
        //     str2.append(pre.val);
        //     pre=pre.next;
        // }

        // if(str1.toString().equals(str2.toString())){
        //     return true;
        // }
        // else{
        //     return false;
        // }

    }
}