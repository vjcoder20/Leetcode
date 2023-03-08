class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        
        int low = 1;
        int high = 0;
        
        for(int elem:arr)
            high = Math.max(high,elem);
        
       
        while(low<=high){
            
            int mid = low+(high-low)/2;
            
            if(canEat(arr,mid,h)){
                high = mid-1;
            }
            
            else
               low = mid+1;
            
            
        }
        
        return low;
    }
        
        
        public boolean canEat(int[] arr,int val,int h){
            
            long req = 0;
            
            for(int i=0;i<arr.length;i++){
                 req+=arr[i]/val;
                 if(arr[i]%val!=0)
                     req++;
            }
            
            return req<=h;
            
        }
        
}