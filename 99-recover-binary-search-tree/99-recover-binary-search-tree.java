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
    TreeNode first;
    TreeNode second;
    TreeNode prev; 
    
    public void recoverTree(TreeNode root) {
        first=second=prev=null;
        helper(root);
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public void helper(TreeNode curr){
        if(curr==null)
            return;
        
        helper(curr.left);
        
        //work
        if(prev!=null && prev.val>curr.val){
            //first mistake
            if(first==null){
                first = prev;
                second = curr;
            }
            
            //second mistake
            else
            second = curr;
        }
        prev = curr;
        
        helper(curr.right);
    }
}