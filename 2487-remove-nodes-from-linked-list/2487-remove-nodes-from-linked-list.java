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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        //insert all node into the stack
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }

        //create a list
        ListNode newHead=stack.pop();
        int max=newHead.val;
        while(!stack.isEmpty()){
            ListNode node=stack.pop();
            if(node.val<max){
                continue;
            }
            else{
                //insert at head
                node.next=newHead;
                newHead=node;
                max=node.val;
            }
        }

        return newHead;
    }
}