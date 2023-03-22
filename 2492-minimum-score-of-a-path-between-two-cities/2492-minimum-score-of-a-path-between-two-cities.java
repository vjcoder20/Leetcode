class Solution {
	int mini = Integer.MAX_VALUE;

	public int minScore(int n, int[][] roads) {
		List<List<int[]>> adj = new ArrayList<>();
		for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
		for (int[] e : roads) {
			adj.get(e[0] - 1).add(new int[] { e[1] - 1, e[2] });
			adj.get(e[1] - 1).add(new int[] { e[0] - 1, e[2] });
		}
		int vis[] = new int[n];
		dfs(0, vis, adj);
		return mini;
	}

	private void dfs(int node, int vis[], List<List<int[]>> adj) {
		vis[node] = 1;
		for (int[] e : adj.get(node)) {
			mini = Math.min(mini, e[1]);
			if (vis[e[0]] == 0) dfs(e[0], vis, adj);
		}
	}
}
