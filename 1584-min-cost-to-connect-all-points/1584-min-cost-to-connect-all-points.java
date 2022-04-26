/*Similar question like kruskal algo in pepcoding Module 
Bas ek cheez ka dhyan usme edgeWt karke compare kar rahe the isme 
manhattan istance se karege isliye pehle jitne bhi distance
possible hai ek priority queue mein dal do and min heap waali banana as smallest distance is preferred distance like 0-1 ,0-2,0-3---1-2,1-3 aise saare ke distance nikal lo and ek pq mein daal do phir DSU laga do easy peasy
*/

class Solution {
    
     int[] parent;
     int[] rank;
    
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                pq.add(new int[]{ findDist(points, i, j), i, j });
            }
        }
        
        // while(pq.size()>0){
        //     int[] arr = pq.remove();
        //     System.out.println(Arrays.toString(arr));
        // }
            
        parent = new int[n];
        rank = new int[n];
            
          int mincost = 0;
        
        for(int i=0;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        
        while(pq.size()>0){
            int[] arr = pq.remove();
            
            int u = arr[1];
            int v = arr[2];
            int cost = arr[0];
            
            if(union(u,v)==true){
                //mincost mein wt add hoga
                mincost+=cost;
            }
        }
        
    
    return mincost;
            
        }
      
    public int findDist(int[][] points, int a, int b) {
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
    
    public boolean union(int u,int v) {
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
            
            return true;
        }
        
        else{
            return false;
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
