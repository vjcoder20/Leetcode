//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
    static class Pair{
        int nbr;
        int wt;
        
        Pair(int nbr,int wt){
            this.nbr = nbr;
            this.wt = wt;
        }
        
        // public String toString(){  
        // return nbr+" "+wt;  
 }  
        
    
    public void dfs(int src,Stack<Integer> st,boolean[] visited,List<List<Pair>> li){
        visited[src] = true;
        
        for(Pair p:li.get(src)){
            if(visited[p.nbr]==false)
            dfs(p.nbr,st,visited,li);
        }
        
        st.push(src);
    }

	public int[] shortestPath(int n,int m, int[][] edges) {
		int[] arr = new int[n];
		Arrays.fill(arr,(int)(1e9));
		
		arr[0] = 0;
		
		List<List<Pair>> li = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		li.add(new ArrayList<>());
		
		for(int i=0;i<m;i++){
		        li.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
		}
		
		//System.out.println(li);
		
		boolean[] visited = new boolean[n];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<n;i++){
		    if(visited[i]==false)
		    dfs(i,st,visited,li);
		}
		
		while(st.size()>0){
		    int elem = st.pop();
		    
		    for(Pair p:li.get(elem)){
		        int v = p.nbr;
		        int weight = p.wt;
		        
		        if(arr[elem]+weight<arr[v])
		        arr[v] = arr[elem]+weight;
		        
		    }
	}
	
	for(int i=0;i<n;i++){
	    if(arr[i]==(int)(1e9))
	    arr[i] = -1;
	}
	
	return arr;
}
}
