class Solution {
    public int findFinalValue(int[] arr, int original) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==original)
            original = arr[i]*2;
        }
        return original;
    }
}