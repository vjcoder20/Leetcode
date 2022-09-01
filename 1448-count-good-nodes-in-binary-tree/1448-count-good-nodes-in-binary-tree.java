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
   int count = 0;
    public int goodNodes(TreeNode root) {
        solve(root,Integer.MIN_VALUE);
        return count;
    }
    
    public void solve(TreeNode root,int prev){
        if(root==null)
            return;
        
        if(root.val>=prev)
            count++;
        
        solve(root.left,Math.max(root.val,prev));
        solve(root.right,Math.max(root.val,prev));
    }
}