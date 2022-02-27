class Solution {
    public double average(int[] arr) {
        Arrays.sort(arr);
        double ans = 0;
        for(int i=1;i<arr.length-1;i++){
            ans+=arr[i];
        }
            return (ans*1.0)/(arr.length-2);
    }
}