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
    public ListNode sortList(ListNode head) {
        //Brute force O(nlongn) && O(n) space
        ArrayList<Integer> al = new ArrayList<>();
        while(head!=null){
            al.add(head.val);
            head = head.next;
        }
        Collections.sort(al);
        ListNode dummy = new ListNode();
       ListNode temp2 = dummy;
        int i = 0;
        while(temp2!=null && i<al.size()){
            
            temp2.next = new ListNode(al.get(i));
             i++;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}