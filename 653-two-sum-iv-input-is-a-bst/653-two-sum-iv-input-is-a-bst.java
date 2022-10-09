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
    public boolean solve(TreeNode root,int k,HashSet<Integer> set){
        if(root==null)
            return false;
        
        if(set.contains(root.val))
            return true;
        
        set.add(k-root.val);
      
        return (solve(root.right,k,set) ||  solve(root.left,k,set));
           
        
    }
    
    public boolean findTarget(TreeNode root, int k) {
        return solve(root,k,new HashSet<>());
    }
}