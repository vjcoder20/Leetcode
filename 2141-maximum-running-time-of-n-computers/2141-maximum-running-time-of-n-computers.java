class Solution {
    public boolean isPossibleRuntime(long mid,int[] batteries,int n){
        long avg = 0;
        for(int i=0;i<batteries.length;i++){
            if(batteries[i]<mid){
                avg+=batteries[i];
            }
            else{
                avg+=mid;
            }
        }
        return avg>=mid*n;
    }
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        long ans = 0;
        for(int i=0;i<batteries.length;i++){
            sum+=batteries[i];
        }
      long low = 0,high=sum;
        while(low<=high){
            long mid = (low+high)/2;
            if(isPossibleRuntime(mid,batteries,n)){
              low = mid+1;
                ans = mid;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}