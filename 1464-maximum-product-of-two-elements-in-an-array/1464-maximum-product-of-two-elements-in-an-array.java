class Solution {
    public int maxProduct(int[] arr) {
    
       int fmax = 0;
       int smax = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fmax){
                smax = fmax;
                fmax = arr[i];
            }
            
            else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        
        return ((smax-1)*(fmax-1));
    }
}