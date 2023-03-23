class Solution {
    public int makeConnected(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        int edges = connections.length;
        ArrayList<ArrayList<Integer>> adj = createGraph(n , connections);
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            if(!visited[i] && edges+1 >= n ){
                ans++;
                dfs(i , adj , visited);
            }
        }
        return ans;
    }
    public void dfs(int v ,  ArrayList<ArrayList<Integer>> adj , boolean[] visited)     {
        visited[v] = true;
        for(Integer neighbour : adj.get(v)){
            if(visited[neighbour] == false){
                dfs(neighbour , adj , visited);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> createGraph(int n , int[][] connections){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i < connections.length ; i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(connections[i][0]);
        }
        return adj;
    }
}