class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        Arrays.sort(arr);
        int score = 0;
        int ans = 0;
        
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            if(arr[low]<=power){
                power-=arr[low];
                score++;
                low++;
                ans = Math.max(ans,score);
            }
            else if(arr[high]>power  && score>0){
                score--;
               power+=arr[high];
                high--;
            }
            else{
                break;
            }
        }
        
        
        return ans;
    }
}