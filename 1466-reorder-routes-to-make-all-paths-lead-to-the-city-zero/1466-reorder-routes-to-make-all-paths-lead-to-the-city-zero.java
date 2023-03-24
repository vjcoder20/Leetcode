class Solution {
    public int minReorder(int n, int[][] connections) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(0, new ArrayList<>());
        }
        Set<String> dirs = new HashSet<>(); // save all directions in 'from#to' format
        buildGraph(connections, graph, dirs); // build an undirected graph
        return dfs(graph, dirs, visited, 0, -1);
    }
    
     private int dfs(List<List<Integer>> graph, Set<String> dirs, boolean[] visited, int i, int prev) {
        int count = 0;
        if (visited[i]) {
            return count;
        }
        visited[i] = true;
        if (prev != -1 && dirs.contains(prev + "#" + i)) {
            count++;
        }
        for (int next: graph.get(i)) {
            count += dfs(graph, dirs, visited, next, i);
        }
        return count;
    }
    
    private void buildGraph(int[][] connections, List<List<Integer>> graph, Set<String> dirs) {
        for (int i = 0; i < connections.length; i++) {
            dirs.add(connections[i][0] + "#" + connections[i][1]);
            graph.get(connections[i][0]).add(connections[i][1]);
            graph.get(connections[i][1]).add(connections[i][0]);
        }
    }
    
    
}
