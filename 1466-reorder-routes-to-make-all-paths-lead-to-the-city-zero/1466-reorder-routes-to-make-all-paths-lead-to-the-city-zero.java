class Solution {
    int ans = 0;
    public int minReorder(int n, int[][] connections) {
        
        List<List<int[]>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
        for(int[] a:connections){
            adj.get(a[0]).add(new int[]{a[1],1});
            adj.get(a[1]).add(new int[]{a[0],0});
        }
        
        
        
        dfs(0,-1,adj);
        return ans;
        
    }
    
    
    public void dfs(int curr,int src, List<List<int[]>> adj){
        
        for(int[] a:adj.get(curr)){
            if(a[0]!=src){
                if(a[1]==1)
                    ans++;
            dfs(a[0],curr,adj);
            }
        }
        
    }
    
}