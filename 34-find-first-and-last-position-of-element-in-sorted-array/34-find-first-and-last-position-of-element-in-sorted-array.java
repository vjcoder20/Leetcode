class Solution {
    public int[] searchRange(int[] arr, int x) {
      /* My Solution
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
        int mid = low+(high-low)/2;    

        if(arr[mid]>x){
          high = mid-1;
        }

        else if(arr[mid]<x){
        low = mid+1;
        }

        else{
            int val = mid;
            while(val-1>=0 && arr[val-1]==x)
               val--;
            
            while(mid+1<arr.length && arr[mid+1]==x)
                mid++;
            
           return new int[]{val,mid};
        }
        }
        return new int[]{-1,-1};
        */
        
        //Public Solution
        int[] result = new int[2];
        result[0] = firstOccurence(arr,x);
        result[1] = lastOccurence(arr,x);
        return result;
    }
    
    public int firstOccurence(int[] arr,int x){
        int idx = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>x)
                end = mid-1;
            
            else if(arr[mid]<x)
                start = mid+1;
            
            else{
                idx = mid;
                end = mid-1;
            }
        }
        return idx;
    }
    
     public int lastOccurence(int[] arr,int x){
        int idx = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>x)
                end = mid-1;
            
            else if(arr[mid]<x)
                start = mid+1;
            
            else{
                idx = mid;
                start = mid+1;
            }
        }
        return idx;
    }
}