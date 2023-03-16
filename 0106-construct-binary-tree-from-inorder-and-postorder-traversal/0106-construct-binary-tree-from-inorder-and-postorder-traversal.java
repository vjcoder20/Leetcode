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
    public TreeNode construct(int[] postorder,int[] inorder,int ps,int pe,int is,int ie){
        
        if(ps>pe || is>ie)
            return null;
    
        TreeNode root = new TreeNode(postorder[pe]);
        int idx = 0;
        
        for(int i=is;i<=ie;i++){
            if(inorder[i]==postorder[pe]){
                idx = i;
                break;
            }
        }
        
        
        
        int colse = idx-is;
    
         root.left = construct(postorder,inorder,ps,ps+colse-1,is,idx-1);
         root.right = construct(postorder,inorder,ps+colse,pe-1,idx+1,ie);
             
        return root;
    
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
    
    return construct(postorder,inorder,0,postorder.length-1,0,inorder.length-1);
        
    }
}