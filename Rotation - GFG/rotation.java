// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int start = 0;
	  int end = n-1;
	  int ans = 0;
	  while(start<=end){
	      int mid = start+(end-start)/2;
	      
	      int prev = (mid+n-1)%n;
	      int next = (mid+1)%n;
	      
	      if(arr[mid]<arr[prev] && arr[mid]<arr[next])
	      return mid;
	      
	      else if(arr[mid]>arr[end])
	      start = mid+1;
	      
	      else
	      end = mid-1;
	  }
	  return ans;
    }
}