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
    public static class Pair implements Comparable<Pair>{
        int x;
        int y;
        TreeNode node;
        
        Pair(int x,int y,TreeNode node){
            this.x = x;
            this.y = y;
            this.node = node;
        }
        
        public int compareTo(Pair o){
            if(this.y!=o.y){
                return this.y-o.y;
            }
            else if(this.x!=o.x){
                return this.x-o.x;
            }
            else{
                return this.node.val-o.node.val;
            }
        }
    }
    
     public void helper(TreeNode root,int x){
        if(root==null)
        return;
        
        sx = Math.min(sx,x);
        lx = Math.max(lx,x);
        
        helper(root.left,x-1);
        helper(root.right,x+1);
        
    }
    
    int sx;
    int lx;
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        sx = Integer.MAX_VALUE;
        lx = Integer.MIN_VALUE;
        
        helper(root,0);
        
        int width = lx-sx+1;
        
        
        
        List<List<Integer>> li = new ArrayList<>();
        for(int i=0;i<width;i++){
            li.add(new ArrayList<>());
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(-sx,0,root));
        while(pq.size()>0){
                //remove
                Pair rp = pq.remove();
                
                //work
             li.get(rp.x).add(rp.node.val);
                
                //add children
                if(rp.node.left!=null)
                    pq.add(new Pair(rp.x-1,rp.y+1,rp.node.left));
                
                if(rp.node.right!=null)
                    pq.add(new Pair(rp.x+1,rp.y+1,rp.node.right));
            
        }
        return li;
    }
}