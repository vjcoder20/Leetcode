class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(rooms,visited,0);
        
        
        for(int i=0;i<n;i++){
            if(visited[i]==false)
                return false;
        }
        
        return true;
        
    }
    
    public void dfs(List<List<Integer>> rooms,boolean[] visited,int room){
        
        visited[room] = true;
        
        for(int val:rooms.get(room)){
                if(visited[val]==false)
                    dfs(rooms,visited,val);
            }
        }
        
    }
    
