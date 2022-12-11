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
       int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathSumHelper(root);
        return maxValue;
    }
    
    public int maxPathSumHelper(TreeNode node) {
   
    if (node == null) {
        return 0;
    }

   
    int leftMaxSum = Math.max(0, maxPathSumHelper(node.left));

   
    int rightMaxSum = Math.max(0, maxPathSumHelper(node.right));

  
    maxValue = Math.max(maxValue, leftMaxSum + rightMaxSum + node.val);

   
    return Math.max(leftMaxSum, rightMaxSum) + node.val;
}
}