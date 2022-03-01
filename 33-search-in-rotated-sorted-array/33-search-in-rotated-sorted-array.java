class Solution {
    public int search(int[] arr, int target) {
        int minidx = findMin(arr);
        int leftHalf = binarySearch(arr,0,minidx-1,target);
        int rightHalf = binarySearch(arr,minidx,arr.length-1,target);
        if(leftHalf != -1)
            return leftHalf;
        if(rightHalf != -1)
            return rightHalf;
        
        return -1;
            
    }
    public int findMin(int[] arr) {
        int n = arr.length;
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
    
    public int binarySearch(int[] arr,int low,int high,int x){
        while(low<=high){
    int mid = low+(high-low)/2;   

        if(arr[mid]>x){
          high = mid-1;
        }

        else if(arr[mid]<x){
        low = mid+1;
        }

        else{
        return mid;
        }
    }
    return -1;
}
}

//It is just a slight inversion of find index of minimum element in sorted rotated array...

