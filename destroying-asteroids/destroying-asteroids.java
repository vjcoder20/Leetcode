class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
       Arrays.sort(arr);
        long sum = mass;
        for(int i=0;i<arr.length;i++){
            if(sum<arr[i]){
                return false;
            }
            sum+=arr[i];
        }
        return true;
    }
}