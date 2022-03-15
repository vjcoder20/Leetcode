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
    public TreeNode construct(int[] preorder, int[] inorder,int ps,int pe,int is,int ie){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ps]);
        
        int idx = 0;
        
        for(int i=is;i<=ie;i++){
            if(preorder[ps]==inorder[i]){
                idx = i;
                break;
            }
        }
        
        int colse = idx-is; //count of node's left subtree element
        root.left = construct(preorder,inorder,ps+1,ps+colse,is,idx-1);
        root.right = construct(preorder,inorder,ps+colse+1,pe,idx+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int ps = 0;  //preorder starting index
        int pe = preorder.length-1;   //preorder ending index
        int is = 0; //Inorder starting index
        int ie = inorder.length-1;   ////Inorder ending index
        
        return construct(preorder,inorder,ps,pe,is,ie);
    }
}