/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    public void inorder(TreeNode root){
        if(root==null)
            return;
         inorder(root.left);
          q.add(root.val);
         inorder(root.right);
    }
    Queue<Integer> q;

    public BSTIterator(TreeNode root) {
        q =  new ArrayDeque<>();
        inorder(root);
    }
    
    public int next() {
       return q.remove();
    }
    
    public boolean hasNext() {
      if(q.size()>0)
          return true;
        else
            return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */