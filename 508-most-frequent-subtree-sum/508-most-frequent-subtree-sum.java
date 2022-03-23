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
    public int helper(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null)
            return 0;
        int sum = 0;
        sum+=root.val;
        if(root.left!=null)
            sum+=helper(root.left,map);
        
        if(root.right!=null)
            sum+=helper(root.right,map);
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
        
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(root,map);
        // System.out.println(map);
        
        int maxfreq = 0;
        for(int freq:map.keySet())
            maxfreq = Math.max(maxfreq,map.get(freq));
        
         List<Integer> al = new ArrayList<>();
          for(int freq:map.keySet()){
              if(map.get(freq)==maxfreq)
                  al.add(freq);
          }
        
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++)
            arr[i] = al.get(i);
           
        
        return arr;
    }
}