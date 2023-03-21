class Solution {
    public long zeroFilledSubarray(int[] arr) {
        
        long ans = 0;
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                count = 0;
            else
            count++;
            
            ans+=count;
        }
        
        return ans;
        
    }
}