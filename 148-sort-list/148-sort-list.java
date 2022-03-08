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
    
    public ListNode mergeTwoLL(ListNode head1,ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        ListNode t1 = head1;
        ListNode t2 = head2;
        
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                prev.next = t1;
                t1 = t1.next;
            }
            else{
                 prev.next = t2;
                t2 = t2.next;
            }
            prev = prev.next;
        }
        if(t1!=null){
            prev.next = t1;
        }
        else if(t2!=null){
            prev.next = t2;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode mid = mid(head);
        ListNode sh = mid.next;
        mid.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(sh);
        
        return mergeTwoLL(left,right);
    }
}