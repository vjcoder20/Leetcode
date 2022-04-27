/*
Maan le ye example hai
"edabc"
[[0,2],[0,3],[1,4]]
o/p: acbed

Toh hum basically kya kar rahe hai grouping kar rahe hai jaise [0,2],[0,3] so in sabka koi ek parent baana do DSU lagakar jaise ki 0 so [0,2,3] so what will happen 0->0, 2->0,      3->0 belongs to same group and similarly [1,4] ka bhi ek parent bana do jaise ki 1 and now so 1->1, 4->1 according to parent ek minHeap priorityQueue mein bhar lo and according to parent nikalkar usko string mein add kar do aapke paas smallest string aa jayegi lexicographically 

Nahi toh ek dry run kar le samaj aa jayega
*/
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