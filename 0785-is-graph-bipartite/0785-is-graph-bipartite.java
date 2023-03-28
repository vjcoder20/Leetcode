class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                boolean c = dfs(graph,i,visited,0);
                if(c==false)
                    return false;
            }
        }
        
        
        return true;
        
           
    }
    
    public boolean dfs(int[][] graph,int src,int[] visited,int color){
        
        visited[src] = color;
        
        for(int elem:graph[src]){
            
            if(visited[elem]==-1){
                boolean c = dfs(graph,elem,visited,1-color);
                if(c==false)
                    return false;
            }
            
            else if(visited[elem]==color)
                return false;
        }
        
        return true;
        
    }
    
}