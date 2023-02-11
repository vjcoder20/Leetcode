class Solution {
    static class Pair{
        int edge;
        char color;
        boolean isVisited;
        Pair(int edge, char color){
            this.edge = edge;
            this.color = color;
            
        }
    }

    public int[] shortestAlternatingPaths(int n, int[][] red, int[][] blue) {

       List<List<Pair>> adj = new ArrayList<>();
      

       // adding ArrayList to  the list
       for(int i = 0; i < n; i++){
           adj.add(new ArrayList<Pair>());
       }
       
       //populating red edges;
       for(int i = 0; i < red.length; i++){
           Pair p = new Pair(red[i][1], 'r');
           adj.get(red[i][0]).add(p);
       }
        
        // populating blue edges
        for(int i = 0; i < blue.length; i++){
           Pair p = new Pair(blue[i][1], 'b');
           adj.get(blue[i][0]).add(p);
       }

       //visited array
       
       //inittialising the ans array
       int[] ans = new int[n];
       Arrays.fill(ans, -1);
       //ans[0] = 0;
       
       //queue for bfs
       Queue<Pair> q = new LinkedList<>();
       q.add(new Pair(0 , 'r'));
       q.add(new Pair(0 , 'b'));
       int res = 0;
       
       

       while(!q.isEmpty()){
           int size = q.size();

           while(size-- > 0){
               Pair p = q.poll();
               int edge = p.edge;
                
               char color = p.color;
              
               if(!p.isVisited && ans[edge] == -1)
                 ans[edge] = res;
                p.isVisited = true;
               System.out.println("edge " +  edge + " " + "color " + color);
               for(Pair pp : adj.get(edge)){
                   System.out.println("ppedge " +  pp.edge + " " + "ppcolor " + pp.color);
                   if (pp.color != color && !pp.isVisited){
                          
                          q.offer(pp); 
                   }
               }
           }
           System.out.println(q);
           res++;
       }
       return ans;
    }
}