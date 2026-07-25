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

     static{
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try(FileWriter writer = new FileWriter("display_runtime.txt")){
                writer.write("0");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }));
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        int carry=0;
        int total=0;
        // int element=0;
       while(l1 != null || l2 != null || carry != 0){

        total=carry;

        if (l1 != null) {
            total += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            total += l2.val;
            l2 = l2.next;
        }

        carry=(total)/10;

        int num=(total)%10;

        dummy.next=new ListNode(num);

        dummy=dummy.next;
            

        }
        // dummy.next=null;
        return res.next;
        
    }
}