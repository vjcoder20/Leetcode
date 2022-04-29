class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        
        int[] pm = new int[n]; //prefix multiplication array
        int[] sm = new int[n];  //suffix multiplication array
        
            pm[0] = arr[0];
            for(int i=1;i<n;i++){
                pm[i] = pm[i-1]*arr[i];
            }
        
        sm[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            sm[i] = sm[i+1]*arr[i];
        }
        
       int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            ans[i] = (i==0?1:pm[i-1])*(i==n-1?1:sm[i+1]);
        }
        
        return ans;
    }
}