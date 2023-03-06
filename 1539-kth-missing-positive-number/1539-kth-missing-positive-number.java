class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int count = 0;
        int start = 0;
        int i = 0;
        
        
        
        while(i<arr.length && count!=k){
            
             start++;
            
            if(arr[i]!=start){
                count++;
            }
            
            else
            i++;
            
           
        }
        
        if(i==arr.length && count!=k)
        return start+k-count;
        
        return start;
    }
}