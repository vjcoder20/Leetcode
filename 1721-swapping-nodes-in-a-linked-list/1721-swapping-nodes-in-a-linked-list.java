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
    public ListNode swapNodes(ListNode head, int k) {
        //Naive aproach
        ListNode start = head;
        ListNode end = head;
        ListNode last = head;
        int length = 0;
        int l = k;
        
        //1st Loop: Find starting node i.e. k-1 from starting
        while(l-->1){
            start = start.next;
        }
        
        //2nd Loop: To find the length of linked list
        while(last!=null){
            last = last.next;
            length++;
        }
        
        //3rd loop: To find the end node i.e. (length-k+1)
        int s = length-k;
        while(s-->0){
            end = end.next;
        }
        
        //Swap the values

        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        
        return head;
    }
}