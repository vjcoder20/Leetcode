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
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return li;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0){
            int count  = q.size();
            List<Integer> temp = new ArrayList<>();
            while(count-->0){
                //remove
                TreeNode rem = q.remove();
                
                //work
                temp.add(rem.val);
                
                //add children
                if(rem.left!=null)
                    q.add(rem.left);
                
                if(rem.right!=null)
                    q.add(rem.right);
            }
            li.add(temp);
        }
        return li;
    }
}