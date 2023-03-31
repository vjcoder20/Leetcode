/*
Basically i have used Detect cycle in a directed graph template to see:

->Any node who is part of cycle can't be part of safe node❌
->Any node leads to cycle can't be part of safe node ❌

*/
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        List<Integer> li = new ArrayList<>();
        int n = graph.length;
        
        boolean[] visited = new boolean[n];
        boolean[] path = new boolean[n];
        boolean[] safe = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(graph,i,visited,path,safe);
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(safe[i]==true)
                li.add(i);
        }
        
        return li;
        
    }
    
    
public boolean dfs(int[][] graph,int src, boolean[] visited,boolean[] path,boolean[] safe){
    
    visited[src] = true;
    path[src] = true;
    
    
    for(int elem:graph[src]){
        if(visited[elem]==false){
            boolean c = dfs(graph,elem,visited,path,safe);
            if(c==true)
                return true;
        }
        
        // if the node has been previously visited
        // but it has to be visited on the same path
        // then return true as these are not safe nodes so we don't want to
        //do safe[src] = true for these nodes so return true from here only
        
        else if(path[elem]==true)
            return true;
    }
    
    safe[src] = true;
    path[src] = false;
    return false;
}
    
}