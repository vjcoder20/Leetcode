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
        inorder(root.right);
         st.push(root.val);
        inorder(root.left);
    }
    Stack<Integer> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        inorder(root);
    }
    
    public int next() {
       return st.pop();
    }
    
    public boolean hasNext() {
      if(st.size()>0)
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