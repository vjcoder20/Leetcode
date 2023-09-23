class Solution {
     public boolean compare(String s,String t){
         if(s.length()!=t.length()+1)
             return false;
         
         int i = 0;
         int j = 0;
         
         while(i<s.length()){
             
            
             if(s.charAt(i)==(j<t.length()?t.charAt(j):'0')){
                 i++;   
                 j++;
             }
             
             else{
                 i++;
             }
         }
         
         
         if(i==s.length() && j==t.length())
             return true;
         else
             return false;
     }
    
    public int longestStrChain(String[] arr) {
     Arrays.sort(arr, (a,b)-> a.length()-b.length());
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxi = 1;
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(arr[i],arr[j])==true && 1+dp[j]>dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
             maxi = Math.max(maxi,dp[i]);
        }
        return maxi;
    }
    
   
}