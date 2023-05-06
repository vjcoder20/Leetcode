class Solution {
    public int numSubseq(int[] arr, int target) {
        int mod = (int)1e9+7;
        Arrays.sort(arr);
        
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = 0;
        
        int[] power = new int[n];
        
        power[0] = 1;
        
        for(int i=1;i<n;i++){
            power[i] = (power[i-1]*2)%mod;
        }
        
        while(low<=high){
            int l = arr[low];
            int h = arr[high];
            
            if(l+h>target){
                high--;
            }
            
            else{
                ans+=power[high-low];
                ans%=mod;
                low++;
            }
            
        }
        
        return ans;
        
    }
}

/*
3,4,5,6 -> 3,6  3,4,6  3,5,6  3,4,5,6
3,4,5 -> 3,5  3,4,5
*/