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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        
         ListNode forw = null;
        while(temp!=null && temp.next!=null){
           forw = temp.next;
            while(forw!=null && forw.val==temp.val){
                temp.next = forw.next;
                forw = forw.next;
            }
            temp = temp.next;
        }
       
        
        return dummy.next;
    }
}