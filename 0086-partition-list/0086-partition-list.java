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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);
        ListNode t1 = small;
        ListNode t2 = large;
        
        ListNode temp = head;
        while(temp!=null){
            int y = temp.val;
            if(y<x){
               t1.next = new ListNode(y);
                t1 = t1.next;
            }
            else{
                t2.next = new ListNode(y);
                t2 = t2.next;
            }
            temp = temp.next;
        }
        
        t1.next = large.next;
        return small.next;
        
    }
}