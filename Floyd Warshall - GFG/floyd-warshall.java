// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    public void shortest_distance(int[][] matrix)
    {
       int n = matrix.length;
       
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(matrix[i][j]==-1)
               matrix[i][j] = Integer.MAX_VALUE;
           }
       }
       
       for(int k=0;k<n;k++){
           for(int u=0;u<n;u++){
               for(int v=0;v<n;v++){
                   //use k as an intermediate
                   if(k!=u && k!=v && u!=v && matrix[u][k]!=Integer.MAX_VALUE && matrix[k][v]!=Integer.MAX_VALUE && matrix[u][k]+matrix[k][v]<matrix[u][v])
                   matrix[u][v] = matrix[u][k]+matrix[k][v];
               }
           }
       }
       
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(matrix[i][j]== Integer.MAX_VALUE)
               matrix[i][j] = -1;
           }
       }
       
    }
}