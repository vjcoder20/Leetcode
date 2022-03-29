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
    static class Pair{
        int inc;
        int exc;
        
        Pair(int inc,int exc){
            this.inc = inc;
            this.exc = exc;
        }
        
        Pair(){
            
        }
    }
    public Pair solve(TreeNode root){
        if(root==null)
            return new Pair();
        
        Pair lp = solve(root.left);
        Pair rp = solve(root.right);
        
        Pair np = new Pair();
        
        np.inc = lp.exc+rp.exc+root.val;
        np.exc = Math.max(lp.inc,lp.exc) + Math.max(rp.exc,rp.inc);
        
        
       return np;
    }
    public int rob(TreeNode root) {
      Pair ans = solve(root);
    return Math.max(ans.inc,ans.exc);
    }
}