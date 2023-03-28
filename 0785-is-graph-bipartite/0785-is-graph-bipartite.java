class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                boolean c = bfs(graph,i,visited);
                if(c==false)
                    return false;
            }
        }
        
        
        return true;
        
           
    }
    
    public boolean bfs(int[][] graph,int src,int[] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(src);
        visited[src] = 0;
        
        while(q.size()>0){
            
            int rem = q.remove();
            
            for(int elem:graph[rem]){
                if(visited[elem]==-1){
                     q.add(elem);
                    visited[elem] = visited[rem]^1;
                }
                
                else if(visited[elem]==visited[rem])
                    return false;
            }
            
        }
        

        return true;
    }
    
}