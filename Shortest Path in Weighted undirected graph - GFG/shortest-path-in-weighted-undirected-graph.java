//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
@SuppressWarnings("unchecked") class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int edges[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                edges[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            List<Integer> ans = obj.shortestPath(n, m, edges);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static class Pair{
        int nbr;
        int wt;
        
        Pair(int nbr,int wt){
            this.nbr = nbr;
            this.wt = wt;
        }
        
        //  public String toString() {
        //     return this.nbr + " " + this.wt;
        // }
 
  }
    
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
        ArrayList<ArrayList<Pair>> al = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] arr = new int[n+1];
        int[] parent = new int[n+1];
       
       Arrays.fill(arr,Integer.MAX_VALUE);
       
       for(int i=1;i<=n;i++)
       parent[i] = i;
        
        for(int i=0;i<=n;i++){
            al.add(new ArrayList<>());
        }
        
        arr[1] = 0;
        
        for(int[] arrr:edges){
            int src = arrr[0];
            int nbr = arrr[1];
            int dist = arrr[2];
            
            al.get(src).add(new Pair(nbr,dist));
            al.get(nbr).add(new Pair(src,dist));
        }
        
        // System.out.println(al);
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.wt - y.wt);
        
        pq.add(new Pair(1,0));
        
        while(pq.size()>0){
           Pair rp = pq.remove();
           int x = rp.nbr;
           int dist = rp.wt;
           ArrayList<Pair> p = al.get(x);
           
           for(Pair rpp:p){
               int nn = rpp.nbr;
               int dd = rpp.wt;
               if(dd+dist<arr[nn]){
               arr[nn] = dd+dist;
               parent[nn] = x;
               pq.add(new Pair(nn,dd+dist));
              }
           }
           
       }
       
        if(arr[n]==Integer.MAX_VALUE){
            ans.add(-1);
            return ans;
        }
        
        int node = n;
        
        while(parent[node]!=node){
            ans.add(node);
            node = parent[node];
        }
        
        ans.add(1);
        
        Collections.reverse(ans);
        
        return ans;
        
        
    }
}