class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(arr));
        
        int ans = 1;
        int endp = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>endp){
                ans++;
                endp = arr[i][1];
            }
        }
        return ans;
    }
}