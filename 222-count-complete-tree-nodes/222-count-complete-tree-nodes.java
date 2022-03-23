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
    /*
    int count = 0;
    public void preorder(TreeNode root){
        if(root==null)
            return;
        
        count++;
        preorder(root.left);
        preorder(root.right);
    }
    */ 
    public int countNodes(TreeNode root) {
         /*O(n) solution
        preorder(root);
        return count;
        */
        //O(Log^2 N) solution
         if(root==null)
             return 0;
        
        int lh = getLeftHeight(root);  //lh-->left height
        int rh = getRightHeight(root); //rh-->right height
        
        if(lh==rh)
            return ((1<<(lh))-1);
        
        else
        return countNodes(root.left) + countNodes(root.right) + 1;  
    }
    
    public int getLeftHeight(TreeNode root){
        int count = 0;
        while(root!=null){
            count++;
            root = root.left;
        }
        return count;
    }
    public int getRightHeight(TreeNode root){
        int count = 0;
        while(root!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}