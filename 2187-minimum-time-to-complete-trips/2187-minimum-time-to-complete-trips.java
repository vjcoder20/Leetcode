class Solution {

    public boolean canComplete(int[] time,int total,long i){
        
        long idharTotal = 0;
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
     long l = 1;
    long h = 100000000000000L;
        
        while(l<h){
          long mid = l+(h-l)/2;
            if(canComplete(time,totalTrips,mid)==true)
                h = mid;
            else
            l = mid+1;
        }
        return l;    
    }
}