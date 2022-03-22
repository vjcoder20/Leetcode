class Solution {
    public int pivotIndex(int[] arr) {
        int ans = -1;
        int j = 0;
        while(j<arr.length){
            int sum1 = 0,sum2=0;
            
            for(int i=0;i<j;i++){
                sum1+=arr[i];
            }
            
            for(int i=j+1;i<arr.length;i++){
                sum2+=arr[i];
            }
            
            if(sum1==sum2){
                ans = j;
                return ans;
            }
            
            j++;
        }
        return ans;
    }
}