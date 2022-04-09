class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void dfs(int[][] graph, int src,List<Integer> al){
        if(src==graph.length-1){
            res.add(new ArrayList<>(al));
            return;
        }
        
      
        for(int elem:graph[src]){
              al.add(elem);
            dfs(graph,elem,al);
             al.remove(al.size()-1);
        }
       
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> al = new ArrayList<>();
        al.add(0);
        
        dfs(graph,0,al);
        return res;
    }
}