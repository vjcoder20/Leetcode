class Solution {
    public int[] sortArray(int[] arr) {
        
        return mergeSort(arr,0,arr.length-1);
        
    }
    
    public int[] mergeSort(int[] arr,int low,int high){
        
        if(low==high)
            return new int[]{arr[low]};
        
        int mid = low+(high-low)/2;
        
       int[] left = mergeSort(arr,low,mid);
       int[] right = mergeSort(arr,mid+1,high);
        
        int[] merged = merge2SortedArrays(left,right);
        
        return merged;
        
    }
    
    public int[] merge2SortedArrays(int[] left,int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] merged = new int[left.length+right.length];
        
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                merged[k] = left[i];
                k++;
                i++;
            }
            
            else{
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        
         while(i<left.length){
             merged[k] = left[i];
             k++;
             i++;
         }
         
          while(j<right.length){
             merged[k] = right[j];
             k++;
             j++;
         }
        
        
        return merged;
    } 
}