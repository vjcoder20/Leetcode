class Solution {
    int maxTime = Integer.MIN_VALUE;

    void DFS(List<List<Integer>> adjList, int[] informTime, int curr, int time) {
        
        maxTime = Math.max(maxTime, time);

        for (int adjacent : adjList.get(curr)) {
            
            DFS(adjList, informTime, adjacent, time + informTime[curr]);
        }
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                adjList.get(manager[i]).add(i);
            }
        }

        DFS(adjList, informTime, headID, 0);
        return maxTime;
    }
}