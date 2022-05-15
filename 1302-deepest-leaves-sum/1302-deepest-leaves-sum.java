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
    int highLevel;
    int ans;
    
    public void dfs(TreeNode root,int level){
        if(root==null)
            return;
        
        dfs(root.left,level+1);
        dfs(root.right,level+1);
        
        if(level>highLevel){
            highLevel = level;
            ans = root.val;
        }
        else if(level==highLevel){
            ans+=root.val;
        }
    }
    
    public int deepestLeavesSum(TreeNode root) {
        highLevel = 0;
        ans = 0;
        dfs(root,0);
        return ans;
    }
}