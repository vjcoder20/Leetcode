class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int i = 0;
        int j = i+1;
        int sum = arr[0];
        int len = Integer.MAX_VALUE;
            
        while(i<arr.length){
            
        
        for(;j<arr.length;j++){
            if(sum>=target){
                break;
            }
            sum+=arr[j];
        }
            
        if(sum>=target)
        len = Math.min(len,j-i);
            
        sum = sum-arr[i];
        i++;
           
            
        }
        
        return (len==Integer.MAX_VALUE?0:len);
    }
}