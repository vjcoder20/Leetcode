/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    
    public void dfs(final TreeNode cloned,final TreeNode target){
        if(cloned==null){
            return;
        }
        if(cloned.val==target.val){
            ans = cloned;
        }
        
        dfs(cloned.left,target);
        dfs(cloned.right,target);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        ans = null;
        dfs(cloned,target);
        return ans;
    }
}