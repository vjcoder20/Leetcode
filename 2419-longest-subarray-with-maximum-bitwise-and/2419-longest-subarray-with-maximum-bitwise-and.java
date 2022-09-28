class Solution {
    public int longestSubarray(int[] arr) {
         int ans = 0;
        int curr = arr[0];
        int length = 1;
        int currlength = 1;
        
        for(int i=0;i<arr.length;i++)
            ans = Math.max(ans,arr[i]);
        
        for(int i=1;i<arr.length;i++){
            if((curr&arr[i])>=ans){
                ans = curr&arr[i];
                currlength++;
                length = Math.max(length,currlength);
            }
            else{
                curr = arr[i];
                currlength = 1;
            }
        }
    
        return length;
    }
}