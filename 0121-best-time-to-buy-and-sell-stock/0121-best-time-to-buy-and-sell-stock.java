class Solution {
    public int maxProfit(int[] arr) {
        
        int profit = 0;
        int minprice = arr[0];
        
        for(int i=1;i<arr.length;i++){
           minprice  = Math.min(minprice,arr[i]);
            profit = Math.max(profit,arr[i]-minprice);
        }
        
        return profit;
        
    }
}