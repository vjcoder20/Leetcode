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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode nn = new ListNode(-1);
        ListNode temp = nn;
        
        while(head!=null){
             
            while(head!=null && head.val==val)
            head = head.next;
            
            temp.next = head;
            temp = temp.next;
            
            if(head!=null)
            head = head.next;
            
        }
        
        
        return nn.next;
        
        
    }
}