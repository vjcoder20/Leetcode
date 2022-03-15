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
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);
        
        int idx = -1;
        
        for(int i=is;i<=ie;i++){
            if(postorder[pe]==inorder[i]){
                idx = i;
                break;
            }
        }
        
        int colse = idx-is; //count of node's left subtree element
        root.left = construct(postorder,inorder,ps,ps+colse-1,is,idx-1);
        root.right = construct(postorder,inorder,ps+colse,pe-1,idx+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         int ps = 0;  //postorder starting index
        int pe = postorder.length-1;   //postorder ending index
        int is = 0; //Inorder starting index
        int ie = inorder.length-1;   ////Inorder ending index
        
        return construct(postorder,inorder,ps,pe,is,ie);
    }
}