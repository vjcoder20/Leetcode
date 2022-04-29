class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        int k = arr.length-1;
        
        while(k>=0){
            if(arr[i]*arr[i]>arr[j]*arr[j]){
                ans[k--] = arr[i]*arr[i];
                i++;
            }
            else{
                ans[k--] = arr[j]*arr[j];
                j--;
            }
           
        }
        return ans;
    }
}