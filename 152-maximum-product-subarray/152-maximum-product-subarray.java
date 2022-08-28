class Solution {
    public int maxProduct(int[] arr) {
        
        int n = arr.length;
        int ans = arr[0];
        int prefix = 1;
        int suffix = 1;
        
        for(int i=0;i<arr.length;i++){
            prefix = (prefix==0?1:prefix)*arr[i];
            suffix = (suffix==0?1:suffix)*arr[n-1-i];
            ans = Math.max(ans,Math.max(prefix,suffix));
        }
        
        
        
        
        return ans;
    }
}