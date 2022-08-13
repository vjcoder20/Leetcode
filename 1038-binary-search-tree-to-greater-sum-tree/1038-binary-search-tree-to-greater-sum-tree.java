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
    int sum = 0;
    public int totalSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = totalSum(root.left);
        int right = totalSum(root.right);
        return left + right + root.val;
    }
    public TreeNode bstToGst(TreeNode root) {
        sum = totalSum(root);
        change(root);
        return root;
    }
    
    public void change(TreeNode root){
        if(root==null)
            return;
        change(root.left);
        int temp = root.val;
        root.val = sum;
        sum-=temp;
        change(root.right);
    }
    
}