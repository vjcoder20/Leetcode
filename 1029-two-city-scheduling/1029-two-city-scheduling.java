class Solution {
    public int twoCitySchedCost(int[][] arr) {
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        }); 
        
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n;i++){
            ans+=i<n/2?arr[i][0]:arr[i][1];
        }
        return ans;
    }
}