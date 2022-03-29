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
    int ans = 0;
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
        
        ans = Math.max(ans,Math.max(np.inc,np.exc));
        
       return np;
    }
    public int rob(TreeNode root) {
        solve(root);
        return ans;
    }
}