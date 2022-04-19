class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        
        for(int i=0;i<numCourses;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            
            graph[u].add(v);
        }
        
        int[] ans = kahn(graph);
        
        if(ans.length==0)
            return false;
        else
            return true;
        
    }
    
    public int[] kahn(ArrayList<Integer>[] graph){
        int n = graph.length;
        
        int[] indegree = new int[n];
        
        for(int i=0;i<n;i++){
            for(int nbr:graph[i]){
                indegree[nbr]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                q.add(i);
        }
    
    ArrayList<Integer> al = new ArrayList<>();
    while(q.size()>0){
        int rem = q.remove();
        al.add(rem);
        
        for(int nbr:graph[rem]){
            indegree[nbr]--;
            
            if(indegree[nbr]==0)
                q.add(nbr);
        }
        
        
    }
       
    if(al.size()==n){
        int[] ts = new int[n];
        for(int i=0;i<al.size();i++){
            ts[i] = al.get(i);
        }
        return ts;
    }
    else{
        return new int[] {};
    }
        
    }
}
