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
class Pair{
    TreeNode node;
    int idx;
    
    Pair(TreeNode node,int idx){
        this.node = node;
        this.idx = idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
         Queue<Pair> q = new ArrayDeque<>();
        int res = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            int size = q.size();
            int lc = q.peek().idx;
            int rc = q.peek().idx;
            while(size-->0){
                Pair rp = q.remove();
                rc = rp.idx;
                
                if(rp.node.left!=null)
                    q.add(new Pair(rp.node.left,rp.idx*2+1));
                
                 if(rp.node.right!=null)
                    q.add(new Pair(rp.node.right,rp.idx*2+2));
            }
            res = Math.max(res,rc-lc+1);
            }
        return res;
    }
}