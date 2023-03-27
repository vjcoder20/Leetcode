//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}}; //tldr
    int countDistinctIslands(int[][] grid) {
        
         HashSet<String> set = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    StringBuilder sb = new StringBuilder();
                    dfs(grid,i,j,sb);
                    if(set.contains(sb.toString())==false){
                        set.add(sb.toString());
                    }
                   
                }
            }
        }
        
        return set.size();
        
    }
    
    
     public void dfs(int[][] grid,int i,int j, StringBuilder sb){
        
        grid[i][j] = 0;
        
        for(int k=0;k<4;k++){
            int ni = i+dir[k][0];
            int nj = j+dir[k][1];
            
            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]==1){
                if(i>ni)
                sb.append('t');

                else if(nj<j)
                 sb.append('l');

                   else if(ni>i)
                 sb.append('d');

                    else if(j<nj)
                 sb.append('r');
                
                dfs(grid,ni,nj,sb);
                sb.append('b');
            }
        }
    }
}
