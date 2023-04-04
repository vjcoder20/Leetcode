//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    class Pair{
        int src;
        int dist;
        
        Pair(int src,int dist){
            this.src = src;
            this.dist = dist;
        }
    }
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        int[] arr = new int[n];
        Arrays.fill(arr,101);
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        li.add(new ArrayList<>());
        
        for(int i=0;i<m;i++){
            li.get(edges[i][0]).add(edges[i][1]);
            li.get(edges[i][1]).add(edges[i][0]);
        }
        
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src,0));
        
        arr[src] = 0;
        
        
        while(q.size()>0){
            Pair rem = q.remove();
            for(int elem:li.get(rem.src)){
                if(arr[rem.src]+1<arr[elem]){
                arr[elem] = arr[rem.src]+1;
                q.add(new Pair(elem,rem.dist+1));
            }
        }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==101)
            arr[i] = -1;
        }
        
        
        
        return arr;
        
    }
}