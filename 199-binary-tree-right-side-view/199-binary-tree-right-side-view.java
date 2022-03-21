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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        
        if(root==null){
            return ans;
        }
        
        q.add(root);
        
        while(q.size()>0){
            int count = q.size();
            int ln = -1;   //last node
            
            while(count-->0){
                //remove
                TreeNode rem = q.remove();
                
                //work
               ln = rem.val;
                
                
                
                
                // add children
                if(rem.left!=null){
                    q.add(rem.left);
                }
                
                 if(rem.right!=null){
                    q.add(rem.right);
                }
                
                
            }
            
            ans.add(ln);
        }
        
        return ans;
    }
}