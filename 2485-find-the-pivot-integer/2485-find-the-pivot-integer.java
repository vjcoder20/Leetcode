class Solution {
    public int pivotInteger(int n) {
        
        int[] pre = new int[n];
        int[] suff = new int[n];
        
        int sum = 0;
        int sum2 = 0;
        
        
        for(int i=1;i<=n;i++){
            sum+=i;
            sum2+=n-i+1;
            pre[i-1] = sum;
            suff[n-i] = sum2;
        }
        
        
        for(int i=0;i<n;i++){
            if(pre[i]==suff[i])
                return i+1;
        }
      
        return -1;
        
        
        
    }
}