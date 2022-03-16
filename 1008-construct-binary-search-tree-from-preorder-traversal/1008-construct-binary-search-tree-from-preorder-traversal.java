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
    static int idx;
    public TreeNode bstFromPreorder(int[] preorder) {
        idx = 0;
        return construct(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    public TreeNode construct(int[] preorder,int lr,int rr){
        
        if(idx>= preorder.length || preorder[idx]<lr || preorder[idx]>rr){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[idx]);
        idx++;
        
        root.left = construct(preorder,lr,root.val);
        root.right = construct(preorder,root.val,rr);
        
        return root;
    }
}