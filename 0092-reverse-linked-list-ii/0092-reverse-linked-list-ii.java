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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
       
        //These 2 lines are used for taking care of base cases.
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
    // Now,we will take 2 pointers which will store the adrress to the left
    //  position and just before the left position
        
        ListNode prev1 = null;
        ListNode curr1 = dummy;
        
        for(int i=0;i<left;i++){
            prev1 = curr1;
            curr1 = curr1.next;
        }
        
        // Here prev1 = 1 and curr1 = 2
        
        //Now, we will use the traditional iterative method to reverse the node
        // from left to right as prev,curr and next.
        
        ListNode prev2 = prev1;
        ListNode curr2 = curr1;
        
        for(int i=left;i<=right;i++){
            ListNode next = curr2.next;
            curr2.next = prev2;
            
            prev2 = curr2;
            curr2 = next;
        }
        
        //After this the condition would look like this
        
//              1-->2<--3<--4-->5
//               <--    
        
// Now the below 2 lines would make 1 next pointing to 4 and 2 next pointing to 5
        
        curr1.next = curr2;
        prev1.next = prev2;
        
     // Finally we will get:   
        
 //       1-->4-->3-->2-->5
        
        
        return dummy.next;
        
        
    }
}