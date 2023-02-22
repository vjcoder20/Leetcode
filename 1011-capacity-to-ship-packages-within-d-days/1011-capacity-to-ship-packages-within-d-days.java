class Solution {
    
    public boolean isFeasible(int[] arr,int val,int d){
        
        int temp = 1;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>val)
                return false;
            
             sum+=arr[i];
            if(sum>val){
                temp++;
                sum = arr[i];
            }
            
        }
        
        
        return temp<=d;
        
    }
    
    public int shipWithinDays(int[] arr, int d) {
        //binary search on answer
        
        int low = 1;
        int high = sum(arr);
       
        
        while(low<=high){
            
            int mid = low+(high-low)/2;
            
            
            if(isFeasible(arr,mid,d)==true)
                high = mid-1;
            
            else
                low = mid+1;
            
        }
        
        
        return low;
        
        
        
    }
    
    public int sum(int[] arr){
        long ans = 0;
        
        for(int elem:arr)
            ans+=elem;
        
        return (int)ans;
    }
    
}