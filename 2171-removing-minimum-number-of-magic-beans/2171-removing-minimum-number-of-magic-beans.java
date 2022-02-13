class Solution {
    public long minimumRemoval(int[] arr) {
        Arrays.sort(arr);
        long ans = Long.MAX_VALUE;
        long sum = 0;
        for(int val:arr){
            sum+=val;
        }
        long len = arr.length;
        for(int i=0;i<arr.length;i++,len--){
            ans = Math.min(ans,sum-len*arr[i]);
        }
        return ans;
    }
}