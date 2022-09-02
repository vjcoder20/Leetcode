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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<Double> li = new ArrayList<>();
        while(q.size()>0){
            int k  = q.size();
            int size = k;
            double sum = 0;
            while(k-->0){
                TreeNode rem = q.remove();
                sum+=rem.val;
                
                if(rem.left!=null)
                    q.add(rem.left);
                
                if(rem.right!=null)
                    q.add(rem.right);
            }
            li.add(sum/(size*1.0));
        }
        return li;
        
    }
}