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
    public ListNode reverse(ListNode head){
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode forw = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode curr1 = reverse(l1);
        ListNode curr2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        
        
        int carry = 0;
        
        while(curr1!=null || curr2!=null || carry>0){
            int sum = carry;
            
            if(curr1!=null){
                sum+=curr1.val;
                curr1 = curr1.next;
            }
            
             if(curr2!=null){
                sum+=curr2.val;
                curr2 = curr2.next;
            }
            
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            
        }
        
   
        return reverse(dummy.next); 
    }
}