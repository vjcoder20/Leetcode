class Solution {
    public int minimizeArrayValue(int[] arr) {
        
        long sum = 0;
        long res = 0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            res = Math.max(res,(sum+i)/(i+1));
        }
        
        return (int)res;
        
    }
}