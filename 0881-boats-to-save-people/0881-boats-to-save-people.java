class Solution {
    public int numRescueBoats(int[] arr, int k) {
        int ans = 0;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
       while(i<=j){
           int sum = arr[i]+arr[j];
           if(sum<=k){
               i++;
               j--;
           }
           else
              j--;
           
           ans++;
       }
        return ans;
    }
}