class Solution {
    public int pivotIndex(int[] arr) {
         int total = 0,sum=0;
        
        for(int elem:arr){
            total+=elem;
        }
        
        for(int i=0;i<arr.length;i++){
            if(2*sum==total-arr[i])
                return i;
            sum+=arr[i];
        }
        
        return -1;
    }
}