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
        if(head==null || head.next==null)
            return head;
        ListNode dummy = new ListNode(-1);
        ListNode itr = dummy;
        itr.next = head;  //potiental unique element
        ListNode curr = head.next;
        while(curr!=null){
            boolean isFlag = false;
            while(curr!=null && itr.next.val==curr.val ){
                isFlag = true;
               curr = curr.next;
            }
            if(isFlag==false)
                itr = itr.next;
            
            else
                itr.next = curr;
            
            if(curr!=null)
                curr = curr.next;
        
        }
        return dummy.next;
    }
}