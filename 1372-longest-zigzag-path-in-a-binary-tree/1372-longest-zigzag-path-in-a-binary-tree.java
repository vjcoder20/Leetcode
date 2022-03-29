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
        int lzzp;  //left se start hone wala path
        int rzzp;  //right se start hone wala path
        int mzzp;  //maximum path not necessarily starting with that particular node or overall max in whole tree
        
        Pair(int lzzp,int rzzp,int mzzp){
            this.lzzp = lzzp;
            this.rzzp = rzzp;
            this.mzzp = mzzp;
        }
    }
    
    public Pair solve(TreeNode root){
        if(root==null)
            return new Pair(-1,-1,0);
        
        Pair lp = solve(root.left);
        Pair rp = solve(root.right);
        
      
        
        int lzzp = 1+lp.rzzp;
        int rzzp = 1+rp.lzzp;
        int mzzp = Math.max(Math.max(lp.mzzp,rp.mzzp),Math.max(lzzp,rzzp));
        
        return new Pair(lzzp,rzzp,mzzp);
    }
    public int longestZigZag(TreeNode root) {
        Pair bp = solve(root);
        return bp.mzzp;
    }
}