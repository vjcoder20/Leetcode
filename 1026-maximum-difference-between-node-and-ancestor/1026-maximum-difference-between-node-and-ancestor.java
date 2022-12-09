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
    int res = 0;
    public int maxAncestorDiff(TreeNode root) {
        helper(root,root.val,root.val);
        return res;
    }
    
    public void helper(TreeNode root,int min,int max){
        if(root==null)  
            return;
        
        min = Math.min(root.val,min);
        max = Math.max(root.val,max);
        res = Math.max(res,max-min);
        helper(root.left,min,max);
        helper(root.right,min,max);
        
    }
}