class Solution {
    public int maxArea(int[] arr) {
       /*
        Naive Approach
        int ans = 0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                ans  = Math.max(ans,Math.min(arr[i],arr[j])*(j-i));
            }
        }
        return ans;
        */
        //Optimised Approach
        int i = 0;
        int j = arr.length-1;
        int ans = 0;
        
        while(i<j){
          ans  = Math.max(ans,Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]<arr[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}