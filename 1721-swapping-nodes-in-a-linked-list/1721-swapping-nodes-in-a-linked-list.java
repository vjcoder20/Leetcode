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
    public ListNode kend(ListNode head, int k){
    ListNode slow = head;
    ListNode fast = head;
    
    //to maintain a gap of k between slow and fast
    while(fast!=null && k-->0){
        fast = fast.next;
    }
    
    if(fast==null && k>0){
        //k>length of linked list
        return null;
    }
    
    if(fast==null){
        //remove the first node from starting
        return head;
    }
    
    while(fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }
        
        return slow.next;
    }
    public ListNode kbegin(ListNode head, int k){
        
        while(head!=null && k-->1){
            head = head.next;
        }
        
        return head;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
    
        ListNode kbegin = kbegin(head,k);
        ListNode kend = kend(head,k);
        
        System.out.println(kbegin.val);
        System.out.println(kend.val);
        
        if(kbegin!=null && kend!=null){
        int temp = kbegin.val;
        kbegin.val = kend.val;
        kend.val = temp;
        }
        
        return head;
      
        
    }
}