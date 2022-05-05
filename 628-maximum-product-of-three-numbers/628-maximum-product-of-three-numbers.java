class Solution {
    public int maximumProduct(int[] arr) {
        int fmax = Integer.MIN_VALUE;    //first max
        int smax = Integer.MIN_VALUE;    //second max
        int tmax = Integer.MIN_VALUE;    //third max
        
        int fmin = Integer.MAX_VALUE;    //first min
        int smin = Integer.MAX_VALUE;    //second min
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=fmax){
                tmax = smax;
                smax = fmax;
                fmax = arr[i];
            }
            else if(arr[i]>=smax){
                tmax = smax;
                smax = arr[i];
            }
            else if(arr[i]>=tmax){
                tmax = arr[i];
            }
           
            
            
            if(arr[i]<=fmin){
                smin = fmin;
                fmin = arr[i];
            }
            
            else if(arr[i]<=smin){
                smin = arr[i];
            }
        }
        int contender1 = fmax*smax*tmax;
        int contender2 = fmin*smin*fmax;
        
        return Math.max(contender1,contender2);
    }
}