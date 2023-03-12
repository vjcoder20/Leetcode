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
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn  = new ListNode(-1);
        ListNode temp = nn;
       
        
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        
        if(list1!=null)
            temp.next = list1;
        
        if(list2!=null)
            temp.next = list2;
        
        
        return nn.next;
        
    }
    
     public ListNode mergeLists(ListNode[] lists,int si,int ei) {
        if(si==ei)  return lists[si];
         
         int mid = si+(ei-si)/2;
         
        ListNode left = mergeLists(lists,si,mid);
        ListNode right = mergeLists(lists,mid+1,ei);
         
         return mergeTwoLists(left,right);
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return mergeLists(lists,0,lists.length-1);
    }
}