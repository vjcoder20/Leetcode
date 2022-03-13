class Solution {
    public int maximumTop(int[] arr, int k) {
        //Bahut saare edge cases hai is question ke so try to attempt cleverly
        
        //edge Case1
        int n = arr.length;
        if(n==1){
            if(k%2==0)
                return arr[0];
            else
            return -1;
        }
        
        //edge case2
        if(k==0){
            if(n>=1)
                return arr[0];
            else
            return -1;
        }
        
         //edge case3
        if(k==1){
            if(n>=2) return arr[1];
            else
            return -1;
        }
        
        //take the max of k-1 elements
        int max = 0;
        for(int i=0;i<Math.min(k-1,n);i++){
            max = Math.max(max,arr[i]);
        }
        
        if(k<n)
            max = Math.max(max,arr[k]);
        
        return max;
        
    }
}