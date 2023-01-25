class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
          HashMap<Integer,Integer> map = new HashMap<>();
          HashMap<Integer,Integer> map2 = new HashMap<>();
        
        boolean[] visited = new boolean[edges.length];
        
        int k = 0;
        while(node1!=-1){      //means no outgoing edge
            visited[node1] = true;
            map.put(node1,k);
            node1 = edges[node1]; 
            if(node1==-1 || visited[node1]==true)     //for detecting cycle
                break;
            k++;
        }
        
        visited = new boolean[edges.length];
        k = 0;
        
         while(node2!=-1){
            visited[node2] = true;
            map2.put(node2,k);
            node2 = edges[node2];
            if(node2==-1 || visited[node2]==true)
                break;
            k++;
        }
        
        int dist = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        
        for(int val:map.keySet()){
            if(map2.containsKey(val)){
              int get1 = map.get(val);
              int get2 = map2.get(val);
              int diff = Math.max(get1,get2);
              if(diff<dist){
                  dist = diff;
                  ans = val;
              }
                else if(diff==dist && val<ans)
                    ans = val;
            }
        }
        
        
        if(ans==Integer.MAX_VALUE)
            return -1;
        
        return ans;
        
        
        
    }
}