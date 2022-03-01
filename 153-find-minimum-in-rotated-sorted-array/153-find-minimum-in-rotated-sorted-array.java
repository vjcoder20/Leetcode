class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int start = 0;
	  int end = n-1;
	  int ans = arr[0];
	  while(start<=end){
	      int mid = start+(end-start)/2;
	      
        int prev = (mid+n-1)%n;   
//nice technique to find index of previous element without worry of edge cases 
	      int next = (mid+1)%n;
//nice technique to find index of next element without worry of edge cases 
	      
	      if(arr[mid]<arr[prev] && arr[mid]<arr[next])
	      return arr[mid];
	      
	      else if(arr[mid]>arr[end])
	      start = mid+1;
	      
	      else
	      end = mid-1;
	  }
	  return ans;
    }
}