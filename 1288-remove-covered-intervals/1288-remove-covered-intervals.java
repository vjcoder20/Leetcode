class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        
        int count = 0;
        Arrays.sort(arr,(a,b)->(a[0]==b[0]?b[1]-a[1]:a[0]-b[0]));
        System.out.println(Arrays.deepToString(arr));
        int li = arr[0][0];
        int ri = arr[0][1];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>=li && arr[i][1]<=ri){
                count++;
            }
            else{
                li = arr[i][0];
                ri = arr[i][1];
            }
        }
        return arr.length-count;
    }
}