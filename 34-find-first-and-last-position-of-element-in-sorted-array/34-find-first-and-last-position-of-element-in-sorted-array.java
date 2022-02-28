class Solution {
    public int[] searchRange(int[] arr, int x) {
       int low = 0;
        int high = arr.length-1;
        boolean flag = false;
        int i = 0;
        int[] arr2 = new int[2];

        while(low<=high){
        int mid = low+(high-low)/2;    

        if(arr[mid]>x){
          high = mid-1;
        }

        else if(arr[mid]<x){
        low = mid+1;
        }

        else{
            flag = true;
            int val = mid;
            while(val-1>=0 && arr[val-1]==x)
               val--;
            arr2[0] = val;
            while(mid+1<arr.length && arr[mid+1]==x)
                mid++;
            arr2[1] = mid;
            break;
        }
        }
        if(flag==true){
           return arr2;
        }
        return new int[]{-1,-1};
    }
}