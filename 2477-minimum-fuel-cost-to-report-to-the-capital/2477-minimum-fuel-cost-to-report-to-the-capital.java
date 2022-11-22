class Solution {
    long ans = 0;
    int s;
    
    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> graph = new ArrayList<>();
        s = seats;
        
        for(int i=0;i<=roads.length;i++)
            graph.add(new ArrayList<>());
        
        for(int i=0;i<roads.length;i++){
            graph.get(roads[i][0]).add(roads[i][1]);
            graph.get(roads[i][1]).add(roads[i][0]);
        }
        
        dfs(graph,0,0);
       
        return ans;
    }
    
    public int dfs(List<List<Integer>> graph,int curr,int prev){
         int people = 1;
        
         for(int x:graph.get(curr)){
             if(x==prev) continue;
             people+=dfs(graph,x,curr);
         }
        
        if(curr!=0) 
            ans+=(people + s - 1) / s;
            
        return people;
    }
}