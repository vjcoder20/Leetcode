class Solution {
    public int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);
         int i=0,n=arr.length,sum=0,ans=1;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while((j-i+1)*arr[j]-sum>k) 
                sum-=arr[i++];
            
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}