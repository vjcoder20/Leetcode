class Solution {
    static class Pair{
        int busStand;
        int level;
        
        Pair(int busStand,int level){
            this.busStand = busStand;
            this.level = level;
        }
        
    }
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>(); //busStand vs BusNo.
        
        for(int i=0;i<routes.length;i++){
            for(int j=0;j<routes[i].length;j++){
                
                int bus = i;
                int busStand = routes[i][j];
                
                ArrayList<Integer> list = map.getOrDefault(busStand,new ArrayList<>());
                list.add(bus);
                map.put(busStand,list);
            }
        }
        
        return bfs(routes,map,source,target);
    }
    
    public int bfs(int[][] routes, HashMap<Integer,ArrayList<Integer>> map,int source,int target){
        Queue<Pair> q = new ArrayDeque<>();
        HashSet<Integer> visbusStand = new HashSet<>();
        HashSet<Integer> visbus = new HashSet<>();
        
        q.add(new Pair(source,0));
        
        while(q.size()>0){
            Pair rem = q.remove();
            
            if(rem.busStand==target){
                return rem.level;
            }
            
            for(int bus:map.get(rem.busStand)){
                if(visbus.contains(bus)==false){
                    visbus.add(bus);
                    for(int busStand:routes[bus]){
                        if(visbusStand.contains(busStand)==false){
                            q.add(new Pair(busStand,rem.level+1));
                            visbusStand.add(busStand);
                        }
                    }
                }
            }
            
        }
        return -1;
    }
}