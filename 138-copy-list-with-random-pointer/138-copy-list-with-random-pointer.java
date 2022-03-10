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
    }
}