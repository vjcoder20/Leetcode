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
    
      public ListNode middleNode(ListNode head) {
          
          
        
        ListNode slow = head;
        ListNode fast = head;
         ListNode temp = null;
        
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return temp;
    }
    
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
              return null;
        
         ListNode res = middleNode(head);
         res.next = res.next.next;
          return head;
    }
}