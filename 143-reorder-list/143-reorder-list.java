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
      public ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
      public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            //preserve
            ListNode n = curr.next;
            
            //connection
            curr.next = prev;
            
            //move
            prev = curr;
            curr = n;
        }
        
        return prev;
        
    }
    public void reorderList(ListNode head) {
        
        ListNode mid = mid(head);
        ListNode sh = mid.next;
        mid.next = null;
        
        ListNode t1 = head;
        ListNode t2 = reverse(sh);
        boolean flag = true;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
       while(t1!=null || t2!=null){
           if(flag==true){
              prev.next = t1;
              t1 = t1.next;
       }
           
           else{
               prev.next = t2;
               t2 = t2.next;
           }
           
           flag = !flag;
           prev = prev.next;
       }
        
    }
}