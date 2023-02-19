class Solution {
    public int minOperations(int n) {
        
        int ans = 0;
        
        if(n<2 || (n & (n - 1)) == 0)
            return 1;
        
        while(n!=0){
            
            int i = (int)(Math.log(n)/Math.log(2));
            int prev = (int)Math.pow(2,i);
            int next = (int)Math.pow(2,++i);
            if(next-n<=n-prev){
                n = next-n;
            }
            
            else{
               n = n-prev; 
            }
             ans++;
        }
        
        
        
        return ans;
        
    }
}