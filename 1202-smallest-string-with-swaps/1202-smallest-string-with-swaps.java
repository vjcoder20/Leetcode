class Solution {
     int[]parent;
     int[]rank;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
       parent = new int[s.length()];
       rank = new int[s.length()];
        
     for(int i=0; i <s.length();i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        
        for(List<Integer> pair:pairs){
            int u = pair.get(0);
            int v = pair.get(1);
            union(u,v);
        }
        
         Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        char[] sChar = s.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            int root = find(i);
           map.put(root,map.getOrDefault(root,new PriorityQueue<>()));
            map.get(root).add(sChar[i]);
        }
        
        // System.out.println(map);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sChar.length; i++) {
            sb.append(map.get(find(i)).remove());
        }
        return sb.toString();
        
        
      
    }
     public void union(int u,int v) {
        int slu = find(u);
        int slv = find(v);

        if(slu != slv) {   
            //merging
            int rslu = rank[slu];
            int rslv = rank[slv];

            if(rslu < rslv) {
                parent[slu] = slv;
            }
            else if(rslv < rslu) {
                parent[slv] = slu;
            }
            else {
                parent[slu] = slv;
                rank[slv]++;
            }
        }
        
    }
    
        public int find(int x) {
        if(parent[x] == x) {
            return x;
        }

        int sl = find(parent[x]);
        parent[x] = sl;   
        return sl;
    }
    
}