class Solution {
    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low+(high-low)/2;
            
            if(arr[mid]==target){
                return true;
            }
            
            //Ex: [1,1,1,1,1,2,1,1,1]  and mid = 4 and target = 2
            if((arr[mid]==arr[high]) && (arr[mid]==arr[low])){
                low++;
                high--;
            }
            
            //Ex: [4,5,6,1,2,2,3,4,4]  mid = 4 and target = 3
            else if(arr[mid]<=arr[high]){   //to check if 'right' part contains target
            if((arr[mid]<target) && (arr[high]>=target))  //right part of array is sorted
                low = mid+1;
                else                           //left part of array is sorted
                high = mid-1;
            }
            
            else{  //to check if 'left' contains target
                if((arr[mid]>target) && (arr[low]<=target))
                    high = mid-1;
                else
                    low = mid+1;
            }
        }
        
        return false;
    }
}