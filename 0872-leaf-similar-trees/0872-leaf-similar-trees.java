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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        
        dfs(root1,al1);
        dfs(root2,al2);
        
        if(al1.equals(al2))
            return true;
        
        return false;
    }
    
    public void dfs(TreeNode root,List<Integer> al){
        if(root==null)
            return;
        
        if(root.right==null && root.left==null)
            al.add(root.val);
        dfs(root.left,al);
        dfs(root.right,al);
    }
}