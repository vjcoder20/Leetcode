class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int abs = Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            int fc = points[i][0];
            int sc = points[i][1];
            if(fc==x || sc==y){
                int diff = Math.abs(fc-x)+Math.abs(sc-y);
                if(diff<abs){
                    abs = diff;
                    ans = i;
                }
            }
            
        }
        return ans;
    }
}