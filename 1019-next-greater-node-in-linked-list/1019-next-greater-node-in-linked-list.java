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
        int count=0;
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextNode;
            count++;
        }

        int[] arr=new int[count];
        Stack<Integer> st=new Stack<>();
        ListNode temp=pre;
        int i=count-1;
        while(temp!=null){
            int value=temp.val;
            while(!st.isEmpty() && st.peek()<=value){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=0;
            }
            else{
                arr[i]=st.peek();
            }
            st.push(value);
            i--;
            temp=temp.next;
        }

        return arr;
        

        //this beats 16.82% and runtime 584ms
        // ListNode temp=head;
        // int count=0;
        // while(temp!=null){
        //     count++;
        //     temp=temp.next;

        // }

        // int[] arr=new int[count];
        // temp=head;
        // int i=0;
        // while(temp!=null){
        //     int val=temp.val;
        //     ListNode temp2=temp.next;
        //     while(temp2!=null){
        //         if(val<temp2.val){
        //             arr[i]=temp2.val;
        //             break;
        //         }
        //         temp2=temp2.next;
        //     }
        //     temp=temp.next;
        //     i++;
        // }
        // return arr;
    }
}