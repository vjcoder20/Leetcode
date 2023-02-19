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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int sign = -1;
        
        while(q.size()>0){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            while(size-->0){
                TreeNode rem = q.remove();
                li.add(rem.val);
                if(rem.left!=null)
                    q.add(rem.left);
                if(rem.right!=null)
                    q.add(rem.right);
            }
            sign = -sign;
            if(sign==-1){
               Collections.reverse(li);
            }
            res.add(li);
            
            
        }
        
        return res;
        
    }
}