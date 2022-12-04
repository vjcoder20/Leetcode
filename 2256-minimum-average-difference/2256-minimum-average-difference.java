class Solution {
    public int minimumAverageDifference(int[] arr) {
        
        long sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        int n = arr.length;

        
        long lsum = 0;
        long min = sum/n;
        int index = n-1;
        
        for(int i=0;i<arr.length-1;i++){
            
            lsum+=arr[i];
            
            long left = lsum/(i+1);
            long right = (sum-lsum)/(n-i-1);
            
            if(Math.abs(left-right)<min){
                min = Math.abs(left-right);
                index = i;
            }
            
            if(Math.abs(left-right)==min){
                if(i<index)
                    index = i;
            }
            
            
            
        }
        
        return index;
        
    }
}