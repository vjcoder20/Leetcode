class Solution {
    public int maxSubArray(int[] arr) {

        //int si = 0;     starting index
       // int ei = 0;     ending index
        
 /*
 Here i have also find starting and ending index of maxSubArray
 to make question more challenging
 */
        
        int currsum = arr[0];
        int maxsum = arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            /*
            if(currsum+arr[i]<arr[i]){
                si = i;
            }
            */
            
            currsum = Math.max(currsum+arr[i],arr[i]);
            
            /*
            
            if(maxsum<currsum){
            ei = i;
            }
            
            */
            
             maxsum = Math.max(maxsum,currsum);
        }
        
      
        
        // System.out.println(si);
        // System.out.println(ei);
        
         return maxsum;
        }
        
       
    }
