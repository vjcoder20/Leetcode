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
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        int rs = helper(root);
        
        //It may be the case where the root itself need camera
        if(rs==0)
        return cam+1;
        
        return cam;
    }
    
    /*
    Some points to know before moving ahead for this question
    0--> Needy i.e. it needs to be covered
    1--> Have camera on itself
    2--> Already covered no need of camera like (null node)
    */
    
    public int helper(TreeNode node){
        if(node==null)
            return 2;
        
        int lci = helper(node.left);  //left child indication
        int rci = helper(node.right); //right child indication
        
        if(lci==0 || rci==0){
            cam++;
            return 1;
        }
        else if(lci==1 || rci==1)
            return 2;
        else 
            return 0;
            
    }
}