class Solution {
     static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr){
         this.src = src;
         this.nbr = nbr;
      }
   }
    public boolean hasPath(ArrayList<Edge>[] graph, int src, int dest,boolean[] visited){
         if(src==dest){
           return true;
       }
       
       visited[src] = true;
       for(Edge edge:graph[src]){
           if(visited[edge.nbr]==false){
           boolean hasNbrPath = hasPath(graph,edge.nbr,dest,visited);
           if(hasNbrPath==true){
               return true;
           }
       }
       }
       return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
         ArrayList<Edge>[] graph = new ArrayList[n];
      for(int i = 0; i < n; i++){
         graph[i] = new ArrayList<>();
      }
        
          for(int[] edge : edges){
              int v1 = edge[0];
              int v2 = edge[1];
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
        }
        
        //  for(int i=0;i<graph.length; i++){
        //     System.out.print(i+"->");
        //     for(Edge e:graph[i]){
        //         System.out.print(e.nbr);
        //     }
        //     System.out.println();
        // }
  
        
        boolean[] visited = new boolean[n];
        return hasPath(graph,source,destination,visited);
    }
}