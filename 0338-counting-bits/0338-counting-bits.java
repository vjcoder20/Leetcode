class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        
        for(int i=1;i<=n;i++){
            ans[i] = count(i);
        }
        
        return ans;
        
    }
    
    public int count(int n){
        
        int ret = 0;
        
        while(n!=0){
            int div = n%2;
            if(div==1)
                ret++;
            n = n/2;
        }
        
        return ret;
    }
    
}