class Solution {
    int[] parent;
    int[] rank;
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        int sl = find(parent[x]);
        parent[x] = sl;
        
        return sl;
    }
    
    public boolean union(int u,int v){
        int slu = find(u);
        int slv = find(v);
        
        if(slu!=slv){
            //merging
            if(rank[slu]<rank[slv])
                parent[slu] = slv;
            
            else if(rank[slv]<rank[slu])
                parent[slv] = slu;
            
            else{
               parent[slv] = slu;
                rank[slv]++;
            }
            
            return true;
        }
        else
            return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        //Keval DSU laga na normal waala
        
        int n = edges.length;
        
        parent = new int[n+1];
        rank = new int[n+1];
        
        for(int i=1;i<=n;i++){
            parent[i] = i;
        }
        
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            if(union(u,v)==false){
                return new int[] {u,v};
            }
        }
        return new int[] {1,1};
    }
}