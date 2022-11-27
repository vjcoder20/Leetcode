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
    public ListNode removeNodes(ListNode head) {
        
        Stack<Integer> st = new Stack<>();
        
        while(head!=null){
            while(st.size()>0 && st.peek()<head.val)
                st.pop();
            st.push(head.val);
            head = head.next;
        }
        
      if(st.size()>0){
          ListNode nhead = new ListNode(st.peek());
          st.pop();
          ListNode temp = nhead;
          
          while(st.size()>0){
              temp.next =  new ListNode(st.peek());
              st.pop();
              temp = temp.next;
          }
          
          return reverse(nhead);
      }
        
        return null;
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode nnext = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = nnext;
        }
        
        return prev;
    }
}