class Solution {

    public boolean canComplete(int[] time,int total,long i){
        
        int idharTotal = 0;
        for(int j=0;j<time.length;j++){
            idharTotal+=i/time[j];
        }
        return idharTotal>=total;
    }
    public long minimumTime(int[] time, int totalTrips) {
        /*
        Naive Approach
        long i = 1;
        while(true){
           if(canComplete(time,totalTrips,i)==true){
               return i;
           }
            i++;
        }
       */
        
        //Optimal Approach
       long lo = 0, hi = 100_000_000_000_000L;
        while (lo < hi) {
            long need = lo + (hi - lo) / 2;
            long trips = 0;
            for (int t : time) {
                trips += need / t;
            }
            if (trips < totalTrips) {
                lo = need + 1;
            }else {
                hi = need;
            }
        }
        return lo;
    }
}