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
    public int countNodes(TreeNode root) {
        
        if(root==null)  
            return 0;
        
        int lh = countleft(root);
        int rh = countright(root);
        
        if(lh==rh)
            return ((2<<lh)-1);
        
        else
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    
    public int countleft(TreeNode node){
        int height = 0;
        
        while(node.left!=null){
            height++;
            node = node.left;
        }
        
        return height;
    }
    
    public int countright(TreeNode node){
        int height = 0;
        
        while(node.right!=null){
            height++;
            node = node.right;
        }
        
        return height;
    }
}