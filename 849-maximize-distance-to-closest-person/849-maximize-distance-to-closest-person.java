//------>1st Method
/*
class Solution {
     public int maxDistToClosest(int[] seats) {
        int res = 0, n = seats.length, last = -1;
        for (int i = 0; i < n; ++i) {
            if (seats[i] == 1) {
                res = last < 0 ? i : Math.max(res, (i - last) / 2);
                last = i;
            }
        }
        res = Math.max(res, n - last - 1);
        return res;
    }
}
*/
//-------->2nd Method
class Solution {
     public int maxDistToClosest(int[] seats) {
         int n = seats.length;
         int result = 0;
         int empty = 0;
         int idx1 = -1,idx2=-1;
         for(int i= 0;i<seats.length;i++){
             if(seats[i]==1){
                 empty = 0;
                 if(idx1 == -1) idx1 = i;
                 idx2=i;
             }
             else{
                 empty++;
                 result = Math.max(result,(empty+1)/2);
             }
         }
         return Math.max(result,Math.max(idx1,n-1-idx2));
     }
}