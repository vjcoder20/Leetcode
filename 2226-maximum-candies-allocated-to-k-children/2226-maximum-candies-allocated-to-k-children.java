class Solution {
    public boolean solve(int[] arr,long k,int mid){
        if(mid==0)
            return true;
       long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]/mid;
        }
        return sum>=k;
    }
    public int maximumCandies(int[] arr, long k) {
        int max = 0;
        
        for(int i=0;i<arr.length;i++)
            max = Math.max(max,arr[i]);
    
        int low = 1;
        int high = max;
        
        while(low<high){
            int mid = low+(high-low)/2;
            
            if(solve(arr,k,mid)==true){
               low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return solve(arr,k,low)?low:low-1;
    }
}