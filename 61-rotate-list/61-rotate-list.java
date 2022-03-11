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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        k = k%size;
        while(k-->0){
            temp = head;
            while(temp!=null && temp.next.next != null){
                temp = temp.next;
            }
            ListNode n = temp.next;
            temp.next = null;
            n.next = head;
            head = n;
        }
        return head;
    }
}