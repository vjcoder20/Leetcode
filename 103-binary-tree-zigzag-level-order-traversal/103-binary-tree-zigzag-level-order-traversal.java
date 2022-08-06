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
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null)
            return ans;
        
      int flag = 0;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        
        while(q.size()>0){
          List<Integer> al = new ArrayList<>();
         int count = q.size();
            
            while(count-->0){
                TreeNode rp = q.remove();
                
                al.add(rp.val);
                
            if(rp.left!=null) q.add(rp.left);
             if(rp.right!=null) q.add(rp.right);
               
            }
            if(flag==0)
            ans.add(al);
            else{
            Collections.reverse(al);
            ans.add(al);
            }
            flag = (flag==0?1:0);
            
        }
        
        return ans;
        
    }
}