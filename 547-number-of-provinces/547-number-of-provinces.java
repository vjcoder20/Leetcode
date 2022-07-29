class Solution {
    public void dfs(int i,int[][] arr,boolean[] visited){
        
       
        
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]==1 && visited[j]==false){
                visited[j] = true;
                dfs(j,arr,visited);
            }
        }
    }
    
    public int findCircleNum(int[][] arr) {
        
        boolean[] visited = new boolean[arr.length];
        
        int count =  0;
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
                dfs(i,arr,visited);
                count++;
        }
        
    }
        
    return count;
}
}