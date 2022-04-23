// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static boolean isFeasible(int[] arr,int mid,int m){
        long sum = 0;
        int k = 1;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                sum = arr[i];
                k++;
            }
        }
        return k<=m;
    }
    public static int findPages(int[]arr,int n,int m)
    {
        long sum = 0;
        int max = 0;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(max,arr[i]);
        }
        
        int low = max;
        int high = (int)sum;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            

            
            if(isFeasible(arr,mid,m)==true){
                high=mid-1;
                ans = mid;
            }
            
            else{
                low = mid+1;
            }
        }
        
        return ans;
    }
};