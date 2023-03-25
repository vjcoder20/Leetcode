class Solution {
    public void dfs(int src,List<List<Integer>> li,boolean[] visited){
        
        visited[src] = true;
        
        for(int elem:li.get(src)){
            if(visited[elem]==false)
                dfs(elem,li,visited);
        }
        
    }
    
    public int findCircleNum(int[][] arr) {
        
        /*
        Firstly I need to convert adjacency matrix to adjacency list so I can
        easily play,although It can be done easily with the matrix also
        */
        
        int n = arr.length;
        int count = 0;
        
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0;i<n;i++)
            li.add(new ArrayList<>());
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //As self nodes are not considered
                if(arr[i][j]==1 && i!=j)
                li.get(i).add(j);
            }
        }
        
        
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                dfs(i,li,visited);
                count++;
            }
        }
        
        return count;
        
        
        
    }
}