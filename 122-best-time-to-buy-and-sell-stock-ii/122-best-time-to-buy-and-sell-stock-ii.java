class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
         int maxProfit = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                maxProfit+=arr[i+1]-arr[i];
            }
        }
        return maxProfit;
    }
}