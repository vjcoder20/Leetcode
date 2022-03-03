class Solution {
    public int longestOnes(int[] arr, int k) {
         int ans = 0;  //ye toh answer hai
       
       int cz = 0;   //count of zero
       int i = -1;
       int j = -1;
       
       while(i<arr.length-1){
           while(i<arr.length-1 && cz<=k){
               i++;
               
               if(arr[i]==0)
               cz++;
               
               if(cz<=k)
               ans = Math.max(ans,i-j);
           }
           
           while(j<i && cz>k){
               j++;
               
               if(arr[j]==0)
               cz--;
           }
       }

        return ans;
    }
}