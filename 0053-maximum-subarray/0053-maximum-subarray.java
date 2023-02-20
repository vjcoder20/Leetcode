class Solution {
    public int maxSubArray(int[] arr) {
        
        int currsum = arr[0];
        int maxsum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            currsum = Math.max(currsum+arr[i],arr[i]);
            maxsum = Math.max(maxsum,currsum);
        }
        
        return maxsum;
        
    }
}