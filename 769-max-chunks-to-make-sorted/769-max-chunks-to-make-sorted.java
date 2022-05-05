class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count = 0;
        int maxR = arr[0];    //maxRange
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxR){
                maxR = arr[i];
            }
            if(i==maxR)
                count++;
        }
        return count;
    }
}