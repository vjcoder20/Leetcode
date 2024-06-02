class Solution {
    public int countDays(int days, int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int end = arr[0][1];
        int start = arr[0][0];
    
        int ans = 0;
        ans+=start-1;
        
        System.out.println(Arrays.deepToString(arr));
        
        for(int i=1;i<arr.length;i++){
            start = arr[i][0];
            if(start-end>0){
                ans+=(start-end)-1;
            }
            end = Math.max(arr[i][1],end);
        }
        
        if(days>end)
            return ans+(days-end);
        
        return ans;
        
    }
}