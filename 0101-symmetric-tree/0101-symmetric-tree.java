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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
            return true;
        
        return isMirror(root.left,root.right);
        
    }
    
    public boolean isMirror(TreeNode p,TreeNode q){
        
        if(p==null || q==null) return p==q;
        
        if(p.val==q.val)
            return isMirror(p.left,q.right) && isMirror(p.right,q.left);
        
        return false;
        
    }
}