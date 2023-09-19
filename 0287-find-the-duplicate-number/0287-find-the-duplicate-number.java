class Solution {
    public int findDuplicate(int[] arr) {
        
        int duplicate = -1;
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
            int idx = Math.abs(arr[i]);
            
            if(arr[idx]<0){
                ans = idx;
                break;
            }
            
            arr[idx]*=-1;
        }
        
        return ans;
    }
}