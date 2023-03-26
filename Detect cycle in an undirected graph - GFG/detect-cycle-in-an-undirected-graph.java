//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    static class Pair {
    int node;
    int parentnode;
    public Pair(int node, int parentnode) {
        this.node = node;
        this.parentnode = parentnode; 
    }
}
    
    
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int n, ArrayList<ArrayList<Integer>> li) {
        
        boolean[] visited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                if(bfs(i,li,visited)) return true;
            }
        }
        
        return false;
    }
        
    public boolean bfs(int src,ArrayList<ArrayList<Integer>> li,boolean[] visited){
        
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src,-1));
        visited[src] = true;
        
        while(q.size()!=0){
            
            Pair rem = q.remove();
            
            for(int elem:li.get(rem.node)){
                if(visited[elem]==false){
                    visited[elem] = true;
                    q.add(new Pair(elem,rem.node));
                }
                
                else if(rem.parentnode!=elem)
                return true;
            }
            
        }
        
        return false;
        
    }
        
}