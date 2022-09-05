/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root==null)
            return li;
    
        Queue<Node> q = new ArrayDeque<>();
    
        q.add(root);
        
    while(q.size()>0){
      int size = q.size();
        List<Integer> al = new ArrayList<>();
      while(size-->0){
          Node rn = q.remove();
          al.add(rn.val);
          
          for(Node child:rn.children){
              q.add(child);
          }
        
      }
    li.add(al); 
    }
        
        return li;
    }
}