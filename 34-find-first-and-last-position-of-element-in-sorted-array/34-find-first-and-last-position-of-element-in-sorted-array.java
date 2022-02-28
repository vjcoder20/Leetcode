class Solution {
    public int[] searchRange(int[] arr, int x) {
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
    }
}