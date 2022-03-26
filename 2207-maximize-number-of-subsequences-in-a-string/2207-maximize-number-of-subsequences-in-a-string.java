class Solution {
    public long count(String a,String b){
         int m = a.length();
         int n = b.length();
 
   
    long lookup[][] = new long[m + 1][n + 1];
         for (int i = 0; i <= n; ++i)
        lookup[0][i] = 0;
 
        for (int i = 0; i <= m; ++i)
        lookup[i][0] = 1;
        
         for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= n; j++)
        {
           
            if (a.charAt(i - 1) == b.charAt(j - 1))
                lookup[i][j] = lookup[i - 1][j - 1] +
                               lookup[i - 1][j];
                 
            else
            lookup[i][j] = lookup[i - 1][j];
        }
    }
 
    return lookup[m][n];
     
    }
    public long maximumSubsequenceCount(String text, String pattern) {
        long ans = 0;
        StringBuilder sb = new StringBuilder(text);
            sb.insert(0,pattern.charAt(0));
            long sub = count(sb.toString(),pattern);
            ans = Math.max(ans,sub);
            sb = new StringBuilder(text);

        sb.insert(text.length(),pattern.charAt(0));
        long last = count(sb.toString(),pattern);
        ans = Math.max(ans,last);
        
         sb = new StringBuilder(text);
       
            sb.insert(0,pattern.charAt(1));
            sub = count(sb.toString(),pattern);
            ans = Math.max(ans,sub);
            sb = new StringBuilder(text);
        
         sb.insert(text.length(),pattern.charAt(1));
        last = count(sb.toString(),pattern);
        ans = Math.max(ans,last);
        
        
        return ans;
    }
}