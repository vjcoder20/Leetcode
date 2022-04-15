class Solution {
    public int findPeakElement(int[] arr) {
        /*Naive Approach --> O(n)
        if(arr.length==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]>arr[i+1])
                    return i;
                }
            
            else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                return i;
            }
        }
        return -1;
        */
        //Optimal approach O(logn)
          if(arr.length==1){
            return 0;
        }
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(mid>0 && mid<n-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid;
                }
                
                else if(arr[mid]>arr[mid-1]){
                    low = mid+1;
                }
                
                else
                high = mid-1;
            }
            
            else if(mid==0){
                if(arr[mid]>arr[1])
                    return mid;
                else
                return 1;
            }
            
            else if(mid==n-1){
                if(arr[n-1]>arr[n-2])
                    return mid;
                else
                return n-2;
            }
        }
        return -1;
        
    }
}