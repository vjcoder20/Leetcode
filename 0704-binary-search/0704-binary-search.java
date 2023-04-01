class Solution {
    public int search(int[] arr, int x) {
        
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==x)
                return mid;
            
            else if(arr[mid]>x){
                high=mid-1;
            }
            
            else
            low = mid+1;
        }
        
        return -1;
        
    }
}