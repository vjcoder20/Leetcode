//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int n, ArrayList<ArrayList<Integer>> li) {
        
        boolean[] visited = new boolean[n];
        boolean[] pathvisited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                if(dfs(li,i,visited,pathvisited))
                return true;
            }
        }
        
        return false;
        
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> li,int src,boolean[] visited,boolean[] pathvisited){
        
        visited[src] = true;
        pathvisited[src] = true;
        
        for(int elem:li.get(src)){
            if(visited[elem]==false){
                boolean check = dfs(li,elem,visited,pathvisited);
                if(check==true)
                return true;
            }
            
            else if(visited[elem]==true && pathvisited[elem]==true)
            return true;
            
            
        }
        
        
        
        pathvisited[src] = false;
        return false;
    }
}