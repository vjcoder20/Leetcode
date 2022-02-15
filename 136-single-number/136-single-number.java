class Solution {
    public int singleNumber(int[] arr) {
        int XOR = 0;
        for(int i=0;i<arr.length;i++){
            XOR^=arr[i];
        }
        return XOR;
    }
}