class Solution {
    
     static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
         
   }
     static class Pair{
        int vtx;
        int lvl;
        
        Pair(int vtx,int lvl){
            this.vtx = vtx;
            this.lvl = lvl;
        }
    }
    
    
    public boolean possibleBipartition(int n, int[][] arr) {
         ArrayList<Edge>[] graph = new ArrayList[n+1];
          for (int i = 0; i <= n; i++) {
         graph[i] = new ArrayList<>();
      }
      
        for(int i=0;i<arr.length;i++){
         int v1 = arr[i][0];
         int v2 = arr[i][1]; 
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2,v1));
        }
        
         int[] visited = new int[n+1];
        Arrays.fill(visited,-1);
        
        for(int i=1;i<=n;i++){
          if(visited[i]==-1){
              boolean ans = isBipartite(graph,i,visited);
              if(ans==false){
                 return false;
              }
          }
      }
       
        return true;
        
    }
    
    
    public boolean isBipartite(ArrayList<Edge>[] graph,int src,int[] visited){
     Queue<Pair> q = new ArrayDeque<>();
      q.add(new Pair(src,0));
     
      while(q.size()>0){
          
          Pair rp = q.remove();
          if(visited[rp.vtx]!=-1){
              if(rp.lvl!=visited[rp.vtx])
                  return false;
          }
          
          else{
             visited[rp.vtx] = rp.lvl;
             for(Edge e:graph[rp.vtx]){
                  int nbr = e.nbr;
                  if(visited[nbr]==-1)
                      q.add(new Pair(nbr,rp.lvl+1));
          }
      }
      
      
}
   
        return true;
    
}
}