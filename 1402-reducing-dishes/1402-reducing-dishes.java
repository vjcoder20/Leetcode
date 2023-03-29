class Solution {
    public int maxSatisfaction(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int ans=0;
        for(int i=n-1;i>=0;i--){
            sum+=arr[i];
            if(sum<0) break;
            ans+=sum;
        }
        return ans;
    }
}