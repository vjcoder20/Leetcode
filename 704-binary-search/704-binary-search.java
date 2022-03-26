class Solution {
    public int search(int[] arr, int target) {
        int ans = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
           if(arr[mid]>target)
               high = mid-1;
            
            else if(arr[mid]<target)
                low = mid+1;
            
            else
                return mid;
        }
        return ans;
    }
}