class Solution {

    boolean isCycle = false;

    public int largestPathValue(String colors, int[][] edges) {

        int n = colors.length();

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<n;i++)
            adjList.add(new ArrayList<>());

        for(int[] edge:edges){
            adjList.get(edge[0]).add(edge[1]);
        }

        int isVisited[] = new int[n];
        Arrays.fill(isVisited,0);

        int[][] dicNodeColorsCnt = new int[n][26];
        for(int[] arr:dicNodeColorsCnt)
            Arrays.fill(arr,0);

        for(int i=0;i<n;i++){
            if(isVisited[i] == 0)
                dfs(i,colors,dicNodeColorsCnt,isVisited,adjList);
        }
        
        if(isCycle == true)
            return -1;

        int largestPathValue = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<26;j++)
                largestPathValue = Math.max(largestPathValue,dicNodeColorsCnt[i][j]);
        }
        return largestPathValue;

    }

    void dfs(int node,String colors,int[][] dicNodeColorsCnt,int[] isVisited,
            List<List<Integer>> adjList){
        
        if(isVisited[node] != 0){
            if(isVisited[node] == 1){
                isCycle = true;
            }
            return;
        }

        isVisited[node] = 1;

        for(int i=0;i<adjList.get(node).size();i++){

            int adjNode = adjList.get(node).get(i);
            dfs(adjNode,colors,dicNodeColorsCnt,isVisited,adjList);
            for(int id=0;id<26;id++){
                dicNodeColorsCnt[node][id] = Math.max(dicNodeColorsCnt[node][id],
                                                      dicNodeColorsCnt[adjNode][id]);
            }
        }

        dicNodeColorsCnt[node][colors.charAt(node) - 'a']++;

        isVisited[node] = 2;

    }
}