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
    public TreeNode construct(int[] preorder, int[] postorder,int prs,int pre,int pos,int poe){
        if(prs>pre || pos>poe){
            return null;
        }
        
    //this base case because we are checking for prs+1 in val so there should be atleast 2 elements needed for below code to be run smmothly
        if(prs==pre){
            return new TreeNode(preorder[prs]); 
        }
        
        TreeNode root = new TreeNode(preorder[prs]);
        int val = preorder[prs+1];
        int idx = -1;
        
        for(int i=pos;i<=poe;i++){
            if(val==postorder[i]){
                idx = i;
                break;
            }
        }
        
        int colse = idx-pos+1;
        root.left = construct(preorder,postorder,prs+1,prs+colse,pos,idx);
        root.right = construct(preorder,postorder,prs+colse+1,pre,idx+1,poe-1);
        return root;
        
        
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int prs = 0;  //Preorder starting index
        int pre = preorder.length-1; //Preorder ending index
        int pos = 0; //PostOrder starting index
        int poe = postorder.length-1; //PostOrder ending index
        
        return construct(preorder,postorder,prs,pre,pos,poe);
    }
}