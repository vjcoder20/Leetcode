/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        /* This takes O(n) space
        Node dummy = new Node(-1);
        Node prev = dummy;
        HashMap<Node,Node> map = new HashMap<>();
        
        Node temp = head;
        while(temp!=null){
            Node n = new Node(temp.val);
            map.put(temp,n);
            prev.next = n;
            prev = prev.next;
            temp = temp.next;
        }
        Node t1 = head;
        Node t2 = dummy.next;
        
        //now set random pointer
        while(t1!=null){
            if(t1.random!=null)
                t2.random = map.get(t1.random);
            else
            t2.random = null;
            
            t1 = t1.next;
            t2 = t2.next;
        }
        
        return dummy.next;
        */
        //This takes O(1)Space
        
        //Insertion of copied nodes
        Node temp = head;
        while(temp!=null){
            Node n = new Node(temp.val);
            Node forw = temp.next;
            temp.next = n;
            n.next = forw;
            temp = forw;
        }
    
        
        //set random pointers
         Node curr = head;
    while(curr!=null){
        curr.next.random = curr.random==null ? null : curr.random.next;
        curr = curr.next.next;
    }
        //segregate original and copied linked list
       Node c1 = head;
        Node ans = c1.next;
       Node c2 = c1.next;
    while(c1!=null && c2!=null){
        Node n1 = c2.next;
        Node n2 = n1==null?null:n1.next;
        
        c1.next = n1;
        c2.next = n2;
        
        c1 = n1;
        c2 = n2;
    }
        return ans;
    }
}