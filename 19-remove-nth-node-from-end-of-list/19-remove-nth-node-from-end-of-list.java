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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode slow = head;
    ListNode fast = head;
    
    //to maintain a gap of k between slow and fast
    while(fast!=null && k-->0){
        fast = fast.next;
    }
    
    if(fast==null && k>0){
        //k>null
        return null;
    }
    
    if(fast==null){
        //remove the first node from starting
        return head.next;
    }
    
    while(fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }
    
    ListNode rem = slow.next;
    slow.next = slow.next.next;
    
    return head;
    }
}