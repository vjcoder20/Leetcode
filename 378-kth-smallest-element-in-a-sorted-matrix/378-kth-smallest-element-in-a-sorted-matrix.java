class Solution {
    
    
    
    public int kthSmallest(int[][] arr, int k) {
        int n = arr.length;
        int low = arr[0][0];
        int high = arr[n-1][n-1];
        
        while(low<high){
            int mid = low+(high-low)/2;
            int count = less(arr,mid);
            if(count<k) low = mid+1;
            else
            high = mid;
        }
        
        return low;
    }
    
    public int less(int[][] arr,int target){
        int count = 0;
        int left = 0;
        int right = arr.length-1;
        
        while(left<arr.length && right>=0){
            if(arr[left][right]>target) right--;
            else{
                count+=right+1;
                left++;
            }
                
        }
        
        
        return count;
    }
}