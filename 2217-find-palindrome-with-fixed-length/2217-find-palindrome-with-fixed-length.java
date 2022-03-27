class Solution {
    public long[] kthPalindrome(int[] queries, int n) {
        long[] ans = new long[queries.length];
        
        int halfLength = (n+1)/2; //why n+1 because of odd length numbers
        
        long start = (long)Math.pow(10,halfLength-1);   //this you need to figure it out
        long end = (long)Math.pow(10,halfLength)-1;     //this you need to figure it out
       
      long total = end-start+1;
      for(int i=0;i<queries.length;i++){
         if(queries[i]<=total){
             
             String left = Long.toString(start+queries[i]-1);   //little bitch trick
             
            StringBuilder temp = new StringBuilder(left);
             String right = temp.reverse().toString();
             
             //this to handling for odd strings example for 4 -> 1001 but for 3 also it is 1001
             //but we don't want 1001 for 3 int length instead we want 101 so we have to remove o from right string which this formula likely to do
             ans[i] = Long.parseLong(left+right.substring(n%2));
             
         }
          else
             ans[i] = -1;
      }
        return ans;
    }
}