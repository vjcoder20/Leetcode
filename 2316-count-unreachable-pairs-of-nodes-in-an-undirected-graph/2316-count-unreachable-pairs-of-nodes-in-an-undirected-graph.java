class Solution {
    long count = 0;
    public void dfs(int src,List<List<Integer>> li, boolean[] visited){
        
        visited[src] = true;
        count++;
        
        for(int elem:li.get(src)){
            if(visited[elem]==false){
                dfs(elem,li,visited);
            }
        }
        
    }
    
    public long countPairs(int n, int[][] arr) {
        
        long ans = 0;
        
        List<List<Integer>> li = new ArrayList<>();
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++)
            li.add(new ArrayList<>());
        
        
        for(int[] a:arr){
            li.get(a[0]).add(a[1]);
            li.get(a[1]).add(a[0]);
        }
        
        
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                count = 0;
             dfs(i,li,visited);
             ans+=count*(n-count);
            }
        }
        
        return ans/2;
        
    }
}