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
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        int rs = helper(root);
        if(rs==0)
        return cam+1;
        
        return cam;
    }
    
    public int helper(TreeNode node){
        if(node==null)
            return 2;
        
        int lci = helper(node.left);
        int rci = helper(node.right);
        
        if(lci==0 || rci==0){
            cam++;
            return 1;
        }
        else if(lci==1 || rci==1)
            return 2;
        else 
            return 0;
            
    }
}