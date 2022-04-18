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
    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> li){
        if(root==null) return li;
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
        return li;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al = inorder(root,new ArrayList<Integer>());
        return al.get(k-1);
    }
}