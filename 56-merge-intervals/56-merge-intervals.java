class Solution {
    public int[][] merge(int[][] Intervals) {
        Arrays.sort(Intervals,(a,b)->a[0]-b[0]);
        
        int sp = Intervals[0][0]; //starting point
        int ep = Intervals[0][1]; //ending point
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for(int i=1;i<Intervals.length;i++){
            int cisp = Intervals[i][0]; //current interval sp
            int ciep = Intervals[i][1]; //current interval ep
            
            if(cisp<=ep){
                ep = Math.max(ciep,ep);
            }
            else{
                ans.add(new int[]{sp,ep});
                sp = cisp;
                ep = ciep;
            }
        }
        ans.add(new int[]{sp,ep});
        
        
        int[][] arr = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            int[] temp = ans.get(i);
            arr[i][0] = temp[0];
            arr[i][1] = temp[1];
        }
        
        return arr;
    }
}