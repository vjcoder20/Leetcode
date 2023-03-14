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
    public int sumNumbers(TreeNode root) {
        
        sumdone(root,0);
        
        return sum;
    }
    
    public void sumdone(TreeNode root,int ans){
        if(root.left==null && root.right==null){
            ans = ans*10+root.val;
            sum+=ans;
            return;
        }
        
        if(root.left!=null)
        sumdone(root.left,ans*10+root.val);
        
        if(root.right!=null)
        sumdone(root.right,ans*10+root.val);
            
    }
}