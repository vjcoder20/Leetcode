class Solution {
    public boolean isPossible(int[] piles,int i,int h){
        int count = 0;
         for(int j=0;j<piles.length;j++){
                count+=(int)Math.ceil((double) piles[j]/(double) i);
                if(count==0){
                    count++;
                }
            }
        return count<=h;
    }
    public int minEatingSpeed(int[] arr, int h) {
        /* Brute force O(N^2)
        long i = 1;
        long ans = 0;
        while(true){
            long count = 0;
            for(int j=0;j<piles.length;j++){
                count+=(int)Math.ceil((double) piles[j]/(double) i);
                if(count==0){
                    count++;
                }
            }
            if(count<=h){
                ans = i;
                break;
            }
            i++;
        }
        return (int)ans;
        */
        int low = 0;
        int max = arr[0];
        int oall = 0;
    for(int i=1;i<arr.length;i++){
        max = Math.max(max,arr[i]);
    }
        if(h==arr.length){
            return max;
        }
        int high = max;
        while(low<=high){
            int mid =low + (high-low)/2;
            if(isPossible(arr,mid,h)==true){
                oall = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return oall;
    }
}